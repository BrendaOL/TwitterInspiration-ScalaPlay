package controllers

import models.{FollowUser, FollowUserDao, Global, PostDao, User, UserDao}

import javax.inject._
import play.api.mvc._

/**
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents, userDao: UserDao, postDao: PostDao, followUserDao: FollowUserDao) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    var username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        // if not log in then he can see all posts made but without any propertie such as like, comment, share..
        val posts = postDao.bringAllPosts
        val follows = followUserDao.bringUser
        val hashtags = postDao.bringAllHashtag
        Ok(views.html.index("Welcome", posts, follows, hashtags)).flashing("info" -> "If you logging you can access to all the properties :). You don't have an account? Create one")
      }
      case Some(user) => {
        val followUsers = followUserDao.bringFollows(user)
        val posts = postDao.bringFollowedPosts(followUsers)
        val hashtags = postDao.bringAllHashtag
        Ok(views.html.index("Welcome", posts, followUsers, hashtags))
      }
    }
  }

  def searchUser() = Action { implicit request: Request[AnyContent] =>
    var username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        val postValues = request.body.asFormUrlEncoded
        postValues.map{ args =>
          val searchBar = args("searchBar").head
          if (searchBar.startsWith("#")){
            val followUsers = followUserDao.bringFollows(user)
            val posts = postDao.bringFollowedPosts(followUsers)
            val hashtags = postDao.bringHashtagBeginsWith(searchBar.replaceAll("#",""))
            Ok(views.html.index("Welcome", posts, followUsers, hashtags))
              .flashing("info" -> "Click on the hashtag to see posts")
          } else {
            var follows:Seq[FollowUser] = Seq()
            val foundUsers = userDao.bringUsersBeginsWith(searchBar)
            foundUsers.map(userFound => {
              follows = follows :+ FollowUser("",userFound.username)
            })
            val followUsers = followUserDao.bringFollows(user)
            val posts = postDao.bringFollowedPosts(followUsers)
            val hashtags = postDao.bringAllHashtag
            Ok(views.html.index("Welcome", posts, follows, hashtags))
              .flashing("info" -> "Click on the user to see their profile")
          }
        }.getOrElse(Redirect(routes.LoginController.signInPage()))
      }
    }
  }

  // bring post order by likes
  def indexOrderLike() = Action { implicit request: Request[AnyContent] =>
    var username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        // if not log in then he can see all posts made but without any propertie such as like, comment, share..
        val posts = postDao.bringAllPostsLikes
        val follows = followUserDao.bringUser
        val hashtags = postDao.bringAllHashtag
        Ok(views.html.index("Welcome", posts, follows, hashtags)).flashing("info" -> "If you logging you can access to all the properties :). You don't have an account? Create one")
      }
      case Some(user) => {
        val followUsers = followUserDao.bringFollows(user)
        val posts = postDao.bringFollowedPostsLikes(followUsers)
        val hashtags = postDao.bringAllHashtag
        Ok(views.html.index("Welcome", posts, followUsers, hashtags))
      }
    }
  }

  //profile from other users
  def trends(text:String) = Action { implicit request: Request[AnyContent] =>
    val posts = postDao.bringTrendPost(text)
    val follows = followUserDao.bringUser
    val hashtags = Seq(text)
    Ok(views.html.index("Welcome", posts, follows, hashtags))
  }

}
