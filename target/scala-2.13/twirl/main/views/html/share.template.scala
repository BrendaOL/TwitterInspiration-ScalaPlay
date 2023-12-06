
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

object share extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Call,Session,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the share thoughts page*/
  def apply/*2.2*/(postUrl: Call)(implicit session: Session, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Share a Thought", session)/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""
"""),format.raw/*5.1*/("""<div class="container pt-4 pb-4">
    <h2>Share to others what you are thinking</h2>
    <form method="post" action=""""),_display_(/*7.34*/routes/*7.40*/.ShareThoughtController.shareUpdated()),format.raw/*7.78*/("""">
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<div class="form-group">
        <textarea class="form-control" name="Text" placeholder="Write here..." rows="6"></textarea>
    </div>
    <!--div class="row form-group">
        <div class="col">
            <h5 id="fileName">Upload an image, if you like: <span id="fileName2">++</span></h5>
            <input type="file" name="Picture">
            <a id="upload" class="btn btn-secondary btn-round">Upload Image</a>
        </div>
    </div-->
    <input type="submit" class="btn btn-primary btn-round" value="upload"/>
    </form>
</div>
<script src='"""),_display_(/*22.15*/routes/*22.21*/.Assets.versioned("javascripts/personalFunctions.js")),format.raw/*22.74*/("""'></script>
""")))}),format.raw/*23.2*/("""

"""))
      }
    }
  }

  def render(postUrl:Call,session:Session,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(postUrl)(session,flash,request)

  def f:((Call) => (Session,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (postUrl) => (session,flash,request) => apply(postUrl)(session,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-19T00:17:16.997
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/share.scala.html
                  HASH: 65309b32a4098f4acd4205bbc3ed1e61fd549701
                  MATRIX: 791->42|965->123|992->125|1032->157|1071->159|1098->160|1242->278|1256->284|1314->322|1347->330|1361->336|1396->351|1427->356|2012->914|2027->920|2101->973|2144->986
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|30->7|31->8|31->8|31->8|32->9|45->22|45->22|45->22|46->23
                  -- GENERATED --
              */
          