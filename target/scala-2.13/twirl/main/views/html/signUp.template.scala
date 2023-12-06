
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

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[User],Call,Session,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the sign up - register page*/
  def apply/*2.2*/(formSignUp: Form[User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Sign Up", session)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
"""),format.raw/*5.1*/("""<div class="container pt-4 pb-4">

    <h2 class="h4 font-weight-bold">CREATE AN ACCOUNT</h2>
    """),_display_(/*8.6*/helper/*8.12*/.form(postUrl)/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""

    """),_display_(/*10.6*/helper/*10.12*/.CSRF.formField),format.raw/*10.27*/("""
    """),format.raw/*11.5*/("""<div class="row form-group">
        <div class="col">
        """),_display_(/*13.10*/helper/*13.16*/.inputText(
            formSignUp("Name"),
            Symbol("label") -> "name",
            Symbol("class") -> "form-control",
            Symbol("placeholder") -> "First name",
            Symbol("id") -> "name"
            )),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""</div>
        <div class="col">
        """),_display_(/*22.10*/helper/*22.16*/.inputText(
            formSignUp("Last name"),
            Symbol("label") -> "Last name",
            Symbol("class") -> "form-control",
            Symbol("placeholder") -> "Last name",
            Symbol("id") -> "lastName"
            )),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""</div>
    </div>
    """),_display_(/*31.6*/helper/*31.12*/.inputText(
    formSignUp("Email"),
    Symbol("class") -> "form-control",
    Symbol("placeholder") -> "Enter an email",
    Symbol("id") -> "email"
    )),format.raw/*36.6*/("""
    """),_display_(/*37.6*/helper/*37.12*/.inputText(
    formSignUp("Username"),
    Symbol("label") -> "Username",
    Symbol("class") -> "form-control",
    Symbol("placeholder") -> "Enter a user name",
    Symbol("id") -> "username"
    )),format.raw/*43.6*/("""
    """),_display_(/*44.6*/helper/*44.12*/.inputPassword(
    formSignUp("Password"),
    Symbol("label") -> "Password",
    Symbol("class") -> "form-control",
    Symbol("placeholder") -> "Enter a Password",
    Symbol("id") -> "password"
    )),format.raw/*50.6*/("""
    """),format.raw/*51.5*/("""<div class="form-group form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">I accept all conditions</label>
    </div>
    <div class="form-action">
        <button type="submit" class="btn btn-success btn-round">Sign Up</button>
    </div>

    """)))}),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""</div>
""")))}),format.raw/*61.2*/("""

"""))
      }
    }
  }

  def render(formSignUp:Form[User],postUrl:Call,session:Session,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(formSignUp,postUrl)(session,request,flash)

  def f:((Form[User],Call) => (Session,MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (formSignUp,postUrl) => (session,request,flash) => apply(formSignUp,postUrl)(session,request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-10T21:58:08.104
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/signUp.scala.html
                  HASH: 8e54dddf1a3d463e01ae64a6b0842f1b0f7720d9
                  MATRIX: 815->46|1021->159|1048->161|1080->185|1119->187|1146->188|1270->287|1284->293|1306->307|1345->309|1378->316|1393->322|1429->337|1461->342|1552->406|1567->412|1817->641|1853->650|1922->692|1937->698|2200->940|2236->949|2285->972|2300->978|2476->1134|2508->1140|2523->1146|2743->1346|2775->1352|2790->1358|3013->1561|3045->1566|3418->1909|3446->1910|3484->1918
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|31->8|31->8|31->8|31->8|33->10|33->10|33->10|34->11|36->13|36->13|42->19|43->20|45->22|45->22|51->28|52->29|54->31|54->31|59->36|60->37|60->37|66->43|67->44|67->44|73->50|74->51|82->59|83->60|84->61
                  -- GENERATED --
              */
          