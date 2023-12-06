package controllers
import models.{Global, UserProfile, UserProfileDAO}

import javax.inject._
import java.nio.file.Paths
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

import java.util.Base64
import java.nio.file.Files

/**
 * Controller por the configuration profile page
 */
@Singleton
class ConfigureController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction, userProfile: UserProfileDAO) extends AbstractController(cc) {

  def configurePage() = authenticatedUserAction { implicit request: Request[AnyContent] =>
    Ok(views.html.configure())
  }

  def upload = Action(parse.multipartFormData) { implicit request =>
    Redirect(routes.ConfigureController.configurePage())
    val username = request.session.get(models.Global.SESSION_USERNAME)
    username match {
      case None => {
        Redirect(routes.LoginController.signInPage())
      }
      case Some(user) => {
        //convert file of picture to Base64
        request.body.file("picture").map { picture =>
          var filename = Paths.get(picture.filename).getFileName
          picture.ref.copyTo(Paths.get(s"D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/$filename"), replace = true)
          val bytes = Files.readAllBytes(Paths.get(s"D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/$filename"))
          val encodedStringPicture = Base64.getEncoder.encodeToString(bytes)
          userProfile.insertProfileImage(user,s"data:image/png;base64,$encodedStringPicture")
          Redirect(routes.ConfigureController.configurePage())
            .flashing("success" -> "Image updated!")
        }.getOrElse {
          Redirect(routes.ConfigureController.configurePage()).flashing(
            "error" -> "File not found on temporary Path, please create this path: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/assignment2/")
        }
      }
    }
  }

  def configureUpdated = authenticatedUserAction { implicit request: Request[AnyContent] =>
    val postValues = request.body.asFormUrlEncoded
    postValues.map{ args =>
      val description = args("description").head
      val phrase = args("phrase").head
      // if not connected then goes to login page
      val username = request.session.get(models.Global.SESSION_USERNAME)
      username match {
        case None => {
          Redirect(routes.LoginController.signInPage())
        }
        case Some(user) => {
          // insert the configuration
          val temp = userProfile.insertProfileText(user,description,phrase)
          Redirect(routes.ProfileController.profile())
            .flashing("success" -> "Profile updated!")
        }
      }
    }.getOrElse(Redirect(routes.ConfigureController.configurePage()))
  }
}
