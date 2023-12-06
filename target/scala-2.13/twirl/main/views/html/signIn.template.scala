
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Session,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the login page*/
  def apply/*2.2*/(message: String)(implicit session: Session, request: RequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", session)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""

"""),format.raw/*6.1*/("""<div class="container pt-4 pb-4">
    <h2 class="h4 font-weight-bold">LOGIN TO YOUR ACCOUNT</h2>
    <form method="post" action=""""),_display_(/*8.34*/routes/*8.40*/.LoginController.signIn()),format.raw/*8.65*/("""">
        """),_display_(/*9.10*/helper/*9.16*/.CSRF.formField),format.raw/*9.31*/("""
        """),format.raw/*10.9*/("""<div class="form-group">
            <input type="text" class="form-control" name="userName" placeholder="Enter your user name" required="true">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Enter your password" required="true">
        </div>
        <button type="submit" class="btn btn-success btn-round">Login</button>
    </form>
    <h1 class="h4 font-weight-bold">You are not registered? <a href=""""),_display_(/*18.71*/routes/*18.77*/.SignUpController.signUp()),format.raw/*18.103*/("""">click here to Sign up!</a></h1>
</div>

""")))}),format.raw/*21.2*/("""

"""))
      }
    }
  }

  def render(message:String,session:Session,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(message)(session,request,flash)

  def f:((String) => (Session,RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (message) => (session,request,flash) => apply(message)(session,request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-10T14:17:59.858
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/signIn.scala.html
                  HASH: 9c1de1839b7b99b3b68eb4cd0a0796e38aad5e03
                  MATRIX: 785->33|961->116|988->118|1018->140|1057->142|1085->144|1241->274|1255->280|1300->305|1338->317|1352->323|1387->338|1423->347|1942->839|1957->845|2005->871|2078->914
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|31->8|31->8|31->8|32->9|32->9|32->9|33->10|41->18|41->18|41->18|44->21
                  -- GENERATED --
              */
          