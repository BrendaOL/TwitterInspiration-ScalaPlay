
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

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[models.User],Call,Session,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User],postUrl: Call)(implicit session: Session, request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("User Login", session)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
    """),format.raw/*4.5*/("""<div class="container pt-4 pb-4">
        <h2 class="h4 font-weight-bold">LOGIN TO YOUR ACCOUNT</h2>
    <form>
        """),_display_(/*7.10*/request/*7.17*/.flash.data.map/*7.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*7.55*/("""
            """),format.raw/*8.13*/("""<div class="form-group">"""),_display_(/*8.38*/name),format.raw/*8.42*/(""": """),_display_(/*8.45*/value),format.raw/*8.50*/("""</div>
        """)))}),format.raw/*9.10*/("""

        """),format.raw/*11.70*/("""
        """),_display_(/*12.10*/if(form.hasGlobalErrors)/*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""
            """),_display_(/*13.14*/form/*13.18*/.globalErrors.map/*13.35*/ { error: FormError =>_display_(Seq[Any](format.raw/*13.57*/("""
                """),format.raw/*14.17*/("""<div>
                    Error: """),_display_(/*15.29*/error/*15.34*/.key),format.raw/*15.38*/(""": """),_display_(/*15.41*/error/*15.46*/.message),format.raw/*15.54*/("""
                """),format.raw/*16.17*/("""</div>
            """)))}),format.raw/*17.14*/("""
        """)))}),format.raw/*18.10*/("""

        """),_display_(/*20.10*/helper/*20.16*/.form(postUrl, Symbol("id") -> "user-login-form")/*20.65*/ {_display_(Seq[Any](format.raw/*20.67*/("""

        """),_display_(/*22.10*/helper/*22.16*/.CSRF.formField),format.raw/*22.31*/("""

        """),_display_(/*24.10*/helper/*24.16*/.inputText(
            form("username"),
            Symbol("label") -> "Username",
            Symbol("placeholder") -> "username",
            Symbol("id") -> "username",
            Symbol("size") -> 60
        )),format.raw/*30.10*/("""

        """),_display_(/*32.10*/helper/*32.16*/.inputPassword(
            form("password"),
            Symbol("label") -> "password",
            Symbol("placeholder") -> "password",
            Symbol("id") -> "password",
            Symbol("size") -> 60
        )),format.raw/*38.10*/("""
            """),format.raw/*39.13*/("""<input type="submit" class="btn btn-success btn-round" value="Log In">
            """)))}),format.raw/*40.14*/("""
    """),format.raw/*41.5*/("""</form>
</div>

    """)))})))}),format.raw/*44.7*/("""

"""))
      }
    }
  }

  def render(form:Form[models.User],postUrl:Call,session:Session,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(session,request,flash)

  def f:((Form[models.User],Call) => (Session,MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (session,request,flash) => apply(form,postUrl)(session,request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-10T14:17:59.879
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/userLogin.scala.html
                  HASH: 35a441e629cecc8a60cc5ac11c6f8090fe3d4dfb
                  MATRIX: 785->1|991->115|1026->142|1065->144|1096->150|1143->189|1193->202|1224->207|1371->328|1386->335|1409->350|1469->373|1509->386|1560->411|1584->415|1613->418|1638->423|1684->439|1722->510|1759->520|1792->544|1832->546|1873->560|1886->564|1912->581|1972->603|2017->620|2078->654|2092->659|2117->663|2147->666|2161->671|2190->679|2235->696|2286->716|2327->726|2365->737|2380->743|2438->792|2478->794|2516->805|2531->811|2567->826|2605->837|2620->843|2857->1059|2895->1070|2910->1076|3151->1296|3192->1309|3307->1393|3339->1398|3394->1420
                  LINES: 21->1|26->2|26->2|26->2|27->3|27->3|27->3|28->4|31->7|31->7|31->7|31->7|32->8|32->8|32->8|32->8|32->8|33->9|35->11|36->12|36->12|36->12|37->13|37->13|37->13|37->13|38->14|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|42->18|44->20|44->20|44->20|44->20|46->22|46->22|46->22|48->24|48->24|54->30|56->32|56->32|62->38|63->39|64->40|65->41|68->44
                  -- GENERATED --
              */
          