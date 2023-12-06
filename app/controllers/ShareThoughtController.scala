package controllers

import models.{Global, Post, PostDao}
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.Forms.{mapping, nonEmptyText}

import javax.inject._
import play.api.mvc._

import java.nio.file.{Files, Paths}
import java.util.Base64
//import play.api.i18n._
/**
 * controller for the share a thought page
 */

@Singleton
class ShareThoughtController @Inject()(cc: ControllerComponents, postDao: PostDao, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {

  private val submitUrl = routes.ShareThoughtController.shareUpdated

  def share() = authenticatedUserAction { implicit request: Request[AnyContent] =>
    var username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(_) => {
        Ok(views.html.share(submitUrl))
      }
    }
  }

  // upload an image
  def upload = Action(parse.multipartFormData) { implicit request =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        //convert file of picture to Base64
        request.body.file("Picture").map { picture =>
          var filename = Paths.get(picture.filename).getFileName
          picture.ref.copyTo(Paths.get(s"D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/$filename"), replace = true)
          val bytes = Files.readAllBytes(Paths.get(s"D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/$filename"))
          val encodedStringPicture = Base64.getEncoder.encodeToString(bytes)
          //userProfile.insertProfileImage(user,s"data:image/png;base64,$encodedStringPicture")
          Redirect(routes.ShareThoughtController.share())
            .withSession(request.session + (Global.SESSION_TEMPFILE -> s"data:image/png;base64,$encodedStringPicture"))
        }.getOrElse {
          Redirect(routes.ShareThoughtController.share()).flashing(
            "error" -> "File not found on temporary Path, please create this path: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/")
        }
      }
    }
  }

  def shareUpdated() = Action { implicit request: Request[AnyContent] =>
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        val postValues = request.body.asFormUrlEncoded
        postValues.map{ args =>
          val text = args("Text").head
          var newPost = false
          val file = request.session.get(models.Global.SESSION_TEMPFILE)
          file match {
            case None => newPost = postDao.insertNewPost(Post(postDao.getNextPost(),text,user,"",0,0,java.time.LocalDate.now.toString,Seq()))
            case Some("") => newPost = postDao.insertNewPost(Post(postDao.getNextPost(),text,user,"",0,0,java.time.LocalDate.now.toString,Seq()))
            case Some(fileData) => newPost = postDao.insertNewPost(Post(postDao.getNextPost(),text,user,fileData,0,0,java.time.LocalDate.now.toString,Seq()))
          }
          if (newPost) {
            Redirect(routes.ProfileController.profile())
              .flashing("success" -> "New post created")
          } else {
            Redirect(routes.ShareThoughtController.shareUpdated())
              .flashing("error" -> "Ooops, please try again.")
          }
        }.getOrElse(Redirect(routes.ShareThoughtController.share()))
      }
    }
  }



}
