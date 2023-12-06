
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Seq[Post],Seq[FollowUser],Seq[String],Session,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(welcome: String, posts:Seq[Post], follows:Seq[FollowUser], hashtags: Seq[String])(implicit session: Session, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.149*/("""

  """),_display_(/*3.4*/main(welcome, session)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),_display_(/*4.6*/defining(play.core.PlayVersion.current)/*4.45*/ { version =>_display_(Seq[Any](format.raw/*4.58*/("""
  """),format.raw/*5.3*/("""<div class="container pt-4 pb-4">
    <h5 class="font-weight-bold spanborder"><span>Hello!</span></h5>
    <div class="row">
      <div class="col-lg-7">
        <a href='"""),_display_(/*9.19*/routes/*9.25*/.HomeController.index()),format.raw/*9.48*/("""' class="btn btn-primary">Date</a>
        <a href='"""),_display_(/*10.19*/routes/*10.25*/.HomeController.indexOrderLike()),format.raw/*10.57*/("""' class="btn btn-outline-primary">Likes</a>
      </div>
      <div class="col-lg-5">
        <div class="row">
          <form method="post" action=""""),_display_(/*14.40*/routes/*14.46*/.HomeController.searchUser()),format.raw/*14.74*/("""">
            """),_display_(/*15.14*/helper/*15.20*/.CSRF.formField),format.raw/*15.35*/("""
              """),format.raw/*16.15*/("""<div class="col">
                <input type="text" name="searchBar" class="form-control input-round" placeholder="Search a username/hashtag">
                <button type="submit" class="btn btn-primary btn-round">Search</button>
              </div>
          </form>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-8">
        """),_display_(/*26.10*/for(post <- posts) yield /*26.28*/ {_display_(Seq[Any](format.raw/*26.30*/("""
        """),format.raw/*27.9*/("""<div class="card border-0 mb-4 box-shadow">
          <div class="card-body px-0 pb-0 d-flex flex-column align-items-start">
            <h2 class="h4 font-weight-bold">
              """),_display_(/*30.16*/post/*30.20*/.userName),format.raw/*30.29*/(""" """),format.raw/*30.30*/("""- """),_display_(/*30.33*/post/*30.37*/.datePost),format.raw/*30.46*/("""
            """),format.raw/*31.13*/("""</h2>
            <p class="card-text">
              """),_display_(/*33.16*/post/*33.20*/.postText),format.raw/*33.29*/("""
            """),format.raw/*34.13*/("""</p>
            """),_display_(/*35.14*/if(!session.get(models.Global.SESSION_USERNAME).isEmpty)/*35.70*/ {_display_(Seq[Any](format.raw/*35.72*/("""
            """),format.raw/*36.13*/("""<div class="row">
              <a onclick='commentReply("""),_display_(/*37.41*/post/*37.45*/.idPost),format.raw/*37.52*/(""")' class="btn btn-light" >
                Comment </a>
              <a onclick='likePost("""),_display_(/*39.37*/post/*39.41*/.idPost),format.raw/*39.48*/(""")' class="btn btn-light" >
                <span id='like"""),_display_(/*40.32*/post/*40.36*/.idPost),format.raw/*40.43*/("""'>Like ("""),_display_(/*40.52*/post/*40.56*/.like),format.raw/*40.61*/(""")</span></a>
              <a onclick='showComment("""),_display_(/*41.40*/post/*41.44*/.idPost),format.raw/*41.51*/(""")' class="btn btn-light" >
                Show Comments </a>
              <a onclick='sharePost("""),_display_(/*43.38*/post/*43.42*/.idPost),format.raw/*43.49*/(""")' class="btn btn-light" >
                <span id='share"""),_display_(/*44.33*/post/*44.37*/.idPost),format.raw/*44.44*/("""'>Share</span></a>
            </div>
            """)))}),format.raw/*46.14*/("""
          """),format.raw/*47.11*/("""</div>
          <div id='postReply"""),_display_(/*48.30*/post/*48.34*/.idPost),format.raw/*48.41*/("""' class="border p-3 bg-lightblue" style="display: none;">
            <div class="row">
              <div class="col-md-12">
                <textarea type="text" id='textReply"""),_display_(/*51.53*/post/*51.57*/.idPost),format.raw/*51.64*/("""' class="form-control" placeholder="Write a comment .." rows="3"></textarea>
              </div>
              <div class="col-md-12 mt-2">
                <a onclick='submitReply("""),_display_(/*54.42*/post/*54.46*/.idPost),format.raw/*54.53*/(""")' class="btn btn-success btn-block">Send</a>
              </div>
            </div>
          </div>
          <div id='commentPost"""),_display_(/*58.32*/post/*58.36*/.idPost),format.raw/*58.43*/("""' class="card-body px-0 pb-0 d-flex flex-column align-items-start"></div>
        </div>
        """)))}),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""</div>
      <div class="col-lg-4">
        <br>
        <div class="flex-md-row mb-4 box-shadow h-xl-300">
          <h2 class="mb-2 h6 font-weight-bold">
            Look for more Users to follow
          </h2>
          <div class="mb-3 d-flex align-items-center">
            <div class="pl-3">
              <div class="card-text text-muted small">
                """),_display_(/*71.18*/for(user <- follows) yield /*71.38*/ {_display_(Seq[Any](format.raw/*71.40*/("""
                """),format.raw/*72.17*/("""<a class="text-dark" href="""),_display_(/*72.44*/routes/*72.50*/.ProfileController.userProfile(user.FollowUser)),format.raw/*72.97*/(""">"""),_display_(/*72.99*/user/*72.103*/.FollowUser),format.raw/*72.114*/("""</a>
                <br>
                """)))}),format.raw/*74.18*/("""
              """),format.raw/*75.15*/("""</div>
            </div>
          </div>
          <h2 class="mb-2 h6 font-weight-bold">
            Trends
          </h2>
          <div class="mb-3 d-flex align-items-center">
            <div class="pl-3">
              <div class="card-text text-muted small">
                """),_display_(/*84.18*/for(hashtag <- hashtags) yield /*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""
                  """),format.raw/*85.19*/("""<a class="text-dark" href='"""),_display_(/*85.47*/routes/*85.53*/.HomeController.trends(hashtag)),format.raw/*85.84*/("""'>#"""),_display_(/*85.88*/hashtag),format.raw/*85.95*/("""</a>
                  <br>
                """)))}),format.raw/*87.18*/("""
              """),format.raw/*88.15*/("""</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
<script src='"""),_display_(/*95.15*/routes/*95.21*/.Assets.versioned("javascripts/personalFunctions.js")),format.raw/*95.74*/("""'></script>
  <!-- End Main -->
    """)))}),format.raw/*97.6*/("""
  """)))}))
      }
    }
  }

  def render(welcome:String,posts:Seq[Post],follows:Seq[FollowUser],hashtags:Seq[String],session:Session,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(welcome,posts,follows,hashtags)(session,flash,request)

  def f:((String,Seq[Post],Seq[FollowUser],Seq[String]) => (Session,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (welcome,posts,follows,hashtags) => (session,flash,request) => apply(welcome,posts,follows,hashtags)(session,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-14T23:07:53.267
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/index.scala.html
                  HASH: 2fd055e7bf51ff6478e3e020b849a2d327095c10
                  MATRIX: 795->1|1038->148|1070->155|1100->177|1139->179|1171->186|1218->225|1268->238|1298->242|1500->418|1514->424|1557->447|1638->501|1653->507|1706->539|1888->694|1903->700|1952->728|1996->745|2011->751|2047->766|2091->782|2498->1162|2532->1180|2572->1182|2609->1192|2824->1380|2837->1384|2867->1393|2896->1394|2926->1397|2939->1401|2969->1410|3011->1424|3095->1481|3108->1485|3138->1494|3180->1508|3226->1527|3291->1583|3331->1585|3373->1599|3459->1658|3472->1662|3500->1669|3621->1763|3634->1767|3662->1774|3748->1833|3761->1837|3789->1844|3825->1853|3838->1857|3864->1862|3944->1915|3957->1919|3985->1926|4113->2027|4126->2031|4154->2038|4241->2098|4254->2102|4282->2109|4366->2162|4406->2174|4470->2211|4483->2215|4511->2222|4719->2403|4732->2407|4760->2414|4972->2599|4985->2603|5013->2610|5178->2748|5191->2752|5219->2759|5350->2859|5385->2867|5794->3249|5830->3269|5870->3271|5916->3289|5970->3316|5985->3322|6053->3369|6082->3371|6096->3375|6129->3386|6205->3431|6249->3447|6569->3740|6609->3764|6649->3766|6697->3786|6752->3814|6767->3820|6819->3851|6850->3855|6878->3862|6956->3909|7000->3925|7139->4037|7154->4043|7228->4096|7297->4135
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|34->9|34->9|34->9|35->10|35->10|35->10|39->14|39->14|39->14|40->15|40->15|40->15|41->16|51->26|51->26|51->26|52->27|55->30|55->30|55->30|55->30|55->30|55->30|55->30|56->31|58->33|58->33|58->33|59->34|60->35|60->35|60->35|61->36|62->37|62->37|62->37|64->39|64->39|64->39|65->40|65->40|65->40|65->40|65->40|65->40|66->41|66->41|66->41|68->43|68->43|68->43|69->44|69->44|69->44|71->46|72->47|73->48|73->48|73->48|76->51|76->51|76->51|79->54|79->54|79->54|83->58|83->58|83->58|85->60|86->61|96->71|96->71|96->71|97->72|97->72|97->72|97->72|97->72|97->72|97->72|99->74|100->75|109->84|109->84|109->84|110->85|110->85|110->85|110->85|110->85|110->85|112->87|113->88|120->95|120->95|120->95|122->97
                  -- GENERATED --
              */
          