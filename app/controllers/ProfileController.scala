package controllers

import models.{FollowUser, FollowUserDao, Global, LikePost, LikePostDao, Post, PostDao, SharePost, SharePostDao, UserDao, UserProfile, UserProfileDAO}
import play.api.mvc.Results.Redirect

import javax.inject._
import play.api.mvc._

import scala.concurrent.Future
//import play.api.i18n._
/**
 */
@Singleton
class ProfileController @Inject()(cc: ControllerComponents,sharePostDao: SharePostDao, likePost: LikePostDao, userDao: UserDao, postDao: PostDao, followUserDao: FollowUserDao, userProfileDao: UserProfileDAO, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {

  def profile() = authenticatedUserAction { implicit request: Request[AnyContent] =>
    var username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        val foundProfile = userProfileDao.getProfileFromID(user)
        val name = userDao.getUserFromID(user)
        val follows = followUserDao.bringFollows(user)
        val posts = postDao.bringPosts(user)
        Ok(views.html.profile(s"${name.name} ${name.lastName}",foundProfile,follows,posts))
      }
    }
  }

  //profile from other users
  def userProfile(username:String) = authenticatedUserAction { implicit request: Request[AnyContent] =>
    val foundProfile = userProfileDao.getProfileFromID(username)
    val name = userDao.getUserFromID(username)
    val follows = followUserDao.bringFollows(username)
    val posts = postDao.bringPosts(username)
    Ok(views.html.profile(s"${name.name} ${name.lastName}",foundProfile,follows,posts))
  }

  // action to like a post called via AJAX
  def likePostClick(idPost: Int)  = Action { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        val foundPost = likePost.checkLikePost(LikePost(idPost,user))
        if (foundPost) {
          likePost.notLikePost(LikePost(idPost,user))
          val newPost = postDao.decreaseLike(idPost)
          Ok(s"Like (${newPost.like}) Post unliked!")
        } else {
          likePost.likePost(LikePost(idPost,user))
          val newPost  = postDao.incrementLike(idPost)
          Ok(s"Like (${newPost.like}) Post liked!")
        }
      }
    }
  }
  // action to follow a user
  def followUserClick(userToFollow: String)  = Action { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        if (followUserDao.checkFollow(FollowUser(user,userToFollow))) {
          followUserDao.notFollowUser(FollowUser(user,userToFollow))
          Ok("Follow me")
        } else {
          followUserDao.followUser(FollowUser(user,userToFollow))
          Ok("Following ✓")
        }
      }
    }
  }

  //Remove a Post on the profile page
  def RemovePost  = authenticatedUserAction { implicit request: Request[AnyContent] =>
    val postValues = request.body.asFormUrlEncoded
    postValues.map{ args =>
        val id = args("idPostRemove").head
        // remove a post that was made
        postDao.removePost(id.toInt)
        //remove a post that was shared
        sharePostDao.removePost(id.toInt)
        Redirect(routes.ProfileController.profile()).flashing("success"->"Post removed!")
    }.getOrElse(Redirect(routes.LoginController.signInPage()))
  }

  // action to share a post
  def sharePostClick(idPost: Int)  = Action { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        if (sharePostDao.checkSharePost(SharePost(idPost,user))) {
          sharePostDao.notSharePost(SharePost(idPost,user))
          Ok("Not Shared")
        } else {
          sharePostDao.sharePost(SharePost(idPost,user))
          Ok("Shared ✓")
        }
      }
    }
  }

  def showCommentClick(idPost: Int) = Action { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        // Bring Post from other Post
        val comments = postDao.bringCommentPost(idPost)
        Ok(views.html.commentSection(comments))
      }
    }
  }

  def submitReply(idPost:Int, text:String) = Action { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        postDao.insertNewPost(Post(postDao.getNextPost(),text,user,"",0,idPost,java.time.LocalDate.now.toString,Seq()))
        // Reload Post
        val comments = postDao.bringCommentPost(idPost)
        Ok(views.html.commentSection(comments))
      }
    }
  }

}
