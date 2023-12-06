
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

object commentSection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[Post],Session,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the profile page*/
  def apply/*2.2*/(comments: Seq[Post])(implicit session: Session, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("profile", session)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
   """),_display_(/*5.5*/if(comments.isEmpty)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<div class="card-body px-0 pb-0 d-flex flex-column align-items-start"><p class="card-text">
         No comments
    </p></div>
   """)))}),format.raw/*9.5*/("""
   """),_display_(/*10.5*/for(comment <- comments) yield /*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
   """),format.raw/*11.4*/("""<div class="card-body px-0 pb-0 d-flex flex-column align-items-start" style="margin-left:10%">
      <h2 class="small font-weight-bold">
          """),_display_(/*13.12*/comment/*13.19*/.userName),format.raw/*13.28*/(""" """),format.raw/*13.29*/("""- """),_display_(/*13.32*/comment/*13.39*/.datePost),format.raw/*13.48*/("""
      """),format.raw/*14.7*/("""</h2>
      <p class="card-text">
          """),_display_(/*16.12*/comment/*16.19*/.postText),format.raw/*16.28*/("""
      """),format.raw/*17.7*/("""</p>
       <div class="row">
           <a onclick='commentReply("""),_display_(/*19.38*/comment/*19.45*/.idPost),format.raw/*19.52*/(""")' class="btn btn-light">
               Comment </a>
           <a onclick='likePost("""),_display_(/*21.34*/comment/*21.41*/.idPost),format.raw/*21.48*/(""")' class="btn btn-light" >
               <span id='like"""),_display_(/*22.31*/comment/*22.38*/.idPost),format.raw/*22.45*/("""'>Like ("""),_display_(/*22.54*/comment/*22.61*/.like),format.raw/*22.66*/(""")</span></a>
           <a onclick='showComment("""),_display_(/*23.37*/comment/*23.44*/.idPost),format.raw/*23.51*/(""")' class="btn btn-light">
               Show Comments </a>
           """),_display_(/*25.13*/if(session.get(models.Global.SESSION_USERNAME) != Some(comment.userName))/*25.86*/ {_display_(Seq[Any](format.raw/*25.88*/("""
           """),format.raw/*26.12*/("""<a onclick='sharePost("""),_display_(/*26.35*/comment/*26.42*/.idPost),format.raw/*26.49*/(""")' class="btn btn-light" >
               <span id='share"""),_display_(/*27.32*/comment/*27.39*/.idPost),format.raw/*27.46*/("""'>Share</span></a>
           """)))}),format.raw/*28.13*/("""
       """),format.raw/*29.8*/("""</div>
   </div>
    <div id='postReply"""),_display_(/*31.24*/comment/*31.31*/.idPost),format.raw/*31.38*/("""' class="border p-3 bg-lightblue" style="display: none;">
        <div class="row">
            <div class="col-md-12">
                <textarea type="text" id='textReply"""),_display_(/*34.53*/comment/*34.60*/.idPost),format.raw/*34.67*/("""' class="form-control" placeholder="Write a comment .." rows="3"></textarea>
            </div>
            <div class="col-md-12 mt-2">
                <a class="btn btn-success btn-block">Send</a>
            </div>
        </div>
    </div>
   <div id='commentPost"""),_display_(/*41.25*/comment/*41.32*/.idPost),format.raw/*41.39*/("""' class="card-body px-0 pb-0 d-flex flex-column align-items-start" style="margin-left:10%"></div>
   """)))}),format.raw/*42.5*/("""
""")))}))
      }
    }
  }

  def render(comments:Seq[Post],session:Session,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(comments)(session,flash)

  def f:((Seq[Post]) => (Session,Flash) => play.twirl.api.HtmlFormat.Appendable) = (comments) => (session,flash) => apply(comments)(session,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-14T19:48:54.041
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/commentSection.scala.html
                  HASH: da24dbcbf36e01db2d916230f5567754b61f5829
                  MATRIX: 784->35|940->98|967->100|999->124|1038->126|1068->131|1096->151|1135->153|1166->158|1327->290|1358->295|1398->319|1438->321|1469->325|1644->473|1660->480|1690->489|1719->490|1749->493|1765->500|1795->509|1829->516|1901->561|1917->568|1947->577|1981->584|2075->651|2091->658|2119->665|2233->752|2249->759|2277->766|2361->823|2377->830|2405->837|2441->846|2457->853|2483->858|2559->907|2575->914|2603->921|2702->993|2784->1066|2824->1068|2864->1080|2914->1103|2930->1110|2958->1117|3043->1175|3059->1182|3087->1189|3149->1220|3184->1228|3251->1268|3267->1275|3295->1282|3494->1454|3510->1461|3538->1468|3833->1736|3849->1743|3877->1750|4009->1852
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|28->5|28->5|29->6|32->9|33->10|33->10|33->10|34->11|36->13|36->13|36->13|36->13|36->13|36->13|36->13|37->14|39->16|39->16|39->16|40->17|42->19|42->19|42->19|44->21|44->21|44->21|45->22|45->22|45->22|45->22|45->22|45->22|46->23|46->23|46->23|48->25|48->25|48->25|49->26|49->26|49->26|49->26|50->27|50->27|50->27|51->28|52->29|54->31|54->31|54->31|57->34|57->34|57->34|64->41|64->41|64->41|65->42
                  -- GENERATED --
              */
          