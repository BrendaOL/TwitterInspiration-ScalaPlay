
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

object configure extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Session,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the configure of the profile page*/
  def apply/*2.2*/()(implicit session: Session, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Configure", session)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
"""),format.raw/*5.1*/("""<div class="container pt-4 pb-4">
    <h2>Configuration of your profile</h2>
    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.ConfigureController.upload, Symbol("enctype") -> "multipart/form-data")/*7.105*/ {_display_(Seq[Any](format.raw/*7.107*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<div class="row form-group">
        <div class="col">
            <h5>Upload an image of yourself</h5>
            <input type="file" name="picture">
            <input type="submit" class="btn btn-success btn-round" value="upload"/>
        </div>
    </div>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""<form method="post" action=""""),_display_(/*17.34*/routes/*17.40*/.ConfigureController.configureUpdated()),format.raw/*17.79*/("""">
    """),_display_(/*18.6*/helper/*18.12*/.CSRF.formField),format.raw/*18.27*/("""
    """),format.raw/*19.5*/("""<div class="form-group">
        <h5>Description</h5>
        <textarea class="form-control" name="description" placeholder="Write something about yourself!, You don't need to count words" rows="4"></textarea>
    </div>
    <div class="form-group">
        <h5>Cool Phrase</h5>
        <textarea class="form-control" name="phrase" placeholder="Write a short phrase to share for others who visit your profile.." rows="2"></textarea>
    </div>
        <input type="submit" class="btn btn-success btn-round" value="Save"/>
    </form>
</div>
""")))}),format.raw/*30.2*/("""

"""))
      }
    }
  }

  def render(session:Session,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(session,flash,request)

  def f:(() => (Session,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (session,flash,request) => apply()(session,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-19T00:34:09.469
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/configure.scala.html
                  HASH: 08db9785ec4bee207bb8070c371edbaeb65c29bd
                  MATRIX: 800->52|961->120|988->122|1022->148|1061->150|1088->151|1195->233|1209->239|1311->332|1351->334|1382->340|1396->346|1431->361|1462->366|1758->632|1790->637|1846->666|1861->672|1921->711|1955->719|1970->725|2006->740|2038->745|2610->1287
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|30->7|30->7|31->8|31->8|31->8|32->9|39->16|40->17|40->17|40->17|40->17|41->18|41->18|41->18|42->19|53->30
                  -- GENERATED --
              */
          