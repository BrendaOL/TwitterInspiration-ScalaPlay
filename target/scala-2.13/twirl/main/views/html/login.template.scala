
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Session,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the login page*/
  def apply/*2.2*/(login: String)(implicit session: Session, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", session)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
"""),format.raw/*5.1*/("""<table>
    <tr>login
    </tr>
</table>
""")))}),format.raw/*9.2*/("""

"""))
      }
    }
  }

  def render(login:String,session:Session,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(login)(session,flash)

  def f:((String) => (Session,Flash) => play.twirl.api.HtmlFormat.Appendable) = (login) => (session,flash) => apply(login)(session,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-10T14:17:59.817
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/login.scala.html
                  HASH: 398bba6e54233def10fed900e9e715aa26cb868d
                  MATRIX: 770->33|920->90|947->92|977->114|1016->116|1043->117|1114->159
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|32->9
                  -- GENERATED --
              */
          