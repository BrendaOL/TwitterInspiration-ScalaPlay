package controllers

import models.{Global, User, UserDao}

import javax.inject.Inject
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import scala.util.matching.Regex

/** Controller for Sign Up page
 */
//@Singleton
class SignUpController @Inject()(cc: MessagesControllerComponents, userDao: UserDao) extends MessagesAbstractController(cc) {

  val signupForm = Form(mapping(
    "Name" ->nonEmptyText
      .verifying("too few chars",  s => lengthIsGreaterThanNCharacters(s, 2)),
    "Last name" ->nonEmptyText
      .verifying("too few chars",  s => lengthIsGreaterThanNCharacters(s, 2)),
    "Email"->email,
    "Username"->nonEmptyText
      .verifying("At least more than 5 characters",  s => lengthIsGreaterThanNCharacters(s, 5))
      .verifying("Cannot be more than 30 characters",  s => lengthIsLessThanNCharacters(s, 20)),
    "Password"->nonEmptyText
      .verifying("Need at least one number",  s => verifyPassword(s))
      .verifying("At least 8 characters",  s => lengthIsGreaterThanNCharacters(s, 7))
      .verifying("Cannot be more than 20 characters",  s => lengthIsLessThanNCharacters(s, 20))
  )(User.apply)(User.unapply))

  private val formSubmitUrl = routes.SignUpController.SignUpAccount

  def signUp() = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.signUp(signupForm,formSubmitUrl))
  }

  def SignUpAccount = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { formWithErrors: Form[User] =>
      BadRequest(views.html.signUp(formWithErrors,formSubmitUrl))
    }
    val successFunction = { user: User =>
      val foundUser: Boolean = userDao.createUser(user)
      if (foundUser) {
        Redirect(routes.LoginController.signInPage())
          .flashing("success" -> "New user created! Try to sign in.")
          .withSession(Global.SESSION_USERNAME -> user.username)
      } else {
        Redirect(routes.LoginController.signInPage())
          .flashing("info" -> "You already have an account. Try to login again")
      }
    }
    val formValidationResult: Form[User] = signupForm.bindFromRequest
    formValidationResult.fold(
      errorFunction,
      successFunction
    )
  }

  private def lengthIsGreaterThanNCharacters(s: String, n: Int): Boolean = {
    if (s.length > n) true else false
  }

  private def lengthIsLessThanNCharacters(s: String, n: Int): Boolean = {
    if (s.length < n) true else false
  }

  private def verifyPassword(s: String): Boolean = {
    val keyPattern: Regex = "([0-9])".r
    keyPattern.findFirstIn(s) match {
      case Some(_) => true
      case None => false
    }
  }
}

