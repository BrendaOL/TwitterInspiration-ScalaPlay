package controllers

import models.{Global, User, UserDao}
import javax.inject._
import play.api.mvc._
/**
 */
@Singleton
class LoginController @Inject()(cc: ControllerComponents, userDao: UserDao) extends AbstractController(cc) {

  def signInPage = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.signIn("this page"))
  }

  def signIn() = Action { implicit request: Request[AnyContent] =>
    val postValues = request.body.asFormUrlEncoded
    postValues.map{ args =>
      val username = args("userName").head
      val password = args("password").head
      val foundUser: Boolean = userDao.validateUser(username, password)
      if (foundUser) {
        Redirect(routes.HomeController.index())
          .flashing("info" -> s"You are logged in: $username")
          .withSession(Global.SESSION_USERNAME -> username)
      } else {
        Redirect(routes.LoginController.signInPage())
          .flashing("error" -> "Invalid username/password, please try again.")
      }
    }.getOrElse(Redirect(routes.LoginController.signInPage()))
  }

}
