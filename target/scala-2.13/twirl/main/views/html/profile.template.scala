
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,UserProfile,Seq[FollowUser],Seq[Post],Session,Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* template of the profile page*/
  def apply/*2.2*/(name: String, profile: UserProfile, follows:Seq[FollowUser], posts:Seq[Post])(implicit session: Session, flash: Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("profile", session)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
"""),format.raw/*5.1*/("""<div class="container">
    <div class="jumbotron jumbotron-fluid mb-3 pt-0 pb-0 bg-lightblue position-relative">
        <div class="pl-4 pr-0 h-100 tofront">
            <div class="row justify-content-between">
                <div class="col-md-6 pt-6 pb-6 align-self-center">
                    <h1 class="secondfont mb-3 font-weight-bold">"""),_display_(/*10.67*/profile/*10.74*/.phrase),format.raw/*10.81*/("""</h1>
                    """),_display_(/*11.22*/if(profile.avatar.isEmpty)/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
                    """),format.raw/*12.21*/("""<img class="rounded-circle shadow" src='"""),_display_(/*12.62*/routes/*12.68*/.Assets.versioned("images/sal.jpg")),format.raw/*12.103*/("""' width="90">
                    """)))}/*13.23*/else/*13.27*/{_display_(Seq[Any](format.raw/*13.28*/("""
                       """),format.raw/*14.24*/("""<img class="rounded-circle shadow" src=""""),_display_(/*14.65*/profile/*14.72*/.avatar),format.raw/*14.79*/("""" width="90">
                    """)))}),format.raw/*15.22*/("""
                """),format.raw/*16.17*/("""</div>
                <div class="col-md-6 d-none d-md-block pr-0" style='background-size:cover;background-image:url("""),_display_(/*17.113*/routes/*17.119*/.Assets.versioned("images/BLOG5.jpg")),format.raw/*17.156*/(""");'>	</div>
            </div>
        </div>
    </div>
    <div class="row">
        <div>
            <div class="mb-3 d-flex align-items-center">
            </div>
            <h1 class="mb-2 h6 font-weight-bold">
                """),_display_(/*26.18*/name),format.raw/*26.22*/("""
            """),format.raw/*27.13*/("""</h1>
            """),_display_(/*28.14*/if(session.get(models.Global.SESSION_USERNAME) == Some(profile.username))/*28.87*/ {_display_(Seq[Any](format.raw/*28.89*/("""
            """),format.raw/*29.13*/("""<h2 class="mb-2 h6 font-weight-bold">
                <a class="text-purple" href="""),_display_(/*30.46*/routes/*30.52*/.ConfigureController.configurePage()),format.raw/*30.88*/(""">CLICK HERE! to configure your profile</a>
            </h2>
            """)))}/*32.15*/else/*32.20*/{_display_(Seq[Any](format.raw/*32.21*/("""
            """),format.raw/*33.13*/("""<a onclick='followUser(""""),_display_(/*33.38*/profile/*33.45*/.username),format.raw/*33.54*/("""")' class="btn btn-orange" style="float:right">
                <span id='followUserCheck'>FOLLOW ME</span></a>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""<div class="mb-3 d-flex align-items-center">
                <div class="pl-3">
                    <div class="pl-3">
                        username: """),_display_(/*39.36*/profile/*39.43*/.username),format.raw/*39.52*/("""
                    """),format.raw/*40.21*/("""</div>
                    <div class="card-text text-muted small">
                        """),_display_(/*42.26*/profile/*42.33*/.content),format.raw/*42.41*/("""
                    """),format.raw/*43.21*/("""</div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-8">
        """),_display_(/*50.10*/for(post <- posts) yield /*50.28*/ {_display_(Seq[Any](format.raw/*50.30*/("""
            """),format.raw/*51.13*/("""<!--hidden id="postID" value='"""),_display_(/*51.44*/post/*51.48*/.idPost),format.raw/*51.55*/("""'></hidden-->
            <div class="card border-0 mb-4 box-shadow">
                <div class="card-body px-0 pb-0 d-flex flex-column align-items-start">
                    <h2 class="h4 font-weight-bold">
                        """),_display_(/*55.26*/name),format.raw/*55.30*/(""" """),format.raw/*55.31*/("""- """),_display_(/*55.34*/post/*55.38*/.datePost),format.raw/*55.47*/("""
                    """),format.raw/*56.21*/("""</h2>
                    <p class="card-text">
                        """),_display_(/*58.26*/post/*58.30*/.postText),format.raw/*58.39*/("""
                    """),format.raw/*59.21*/("""</p>
                    <div class="row">
                        <a onclick='commentReply("""),_display_(/*61.51*/post/*61.55*/.idPost),format.raw/*61.62*/(""")' class="btn btn-light" >
                            Comment </a>
                        <a onclick='likePost("""),_display_(/*63.47*/post/*63.51*/.idPost),format.raw/*63.58*/(""")' class="btn btn-light" >
                            <span id='like"""),_display_(/*64.44*/post/*64.48*/.idPost),format.raw/*64.55*/("""'>Like ("""),_display_(/*64.64*/post/*64.68*/.like),format.raw/*64.73*/(""")</span></a>
                        <a onclick='showComment("""),_display_(/*65.50*/post/*65.54*/.idPost),format.raw/*65.61*/(""")' class="btn btn-light" >
                            Show Comments </a>
                        """),_display_(/*67.26*/if(session.get(models.Global.SESSION_USERNAME) == Some(profile.username))/*67.99*/ {_display_(Seq[Any](format.raw/*67.101*/("""
                        """),format.raw/*68.25*/("""<form method="post" action=""""),_display_(/*68.54*/routes/*68.60*/.ProfileController.RemovePost()),format.raw/*68.91*/("""">
                            """),_display_(/*69.30*/helper/*69.36*/.CSRF.formField),format.raw/*69.51*/("""
                            """),format.raw/*70.29*/("""<input type="hidden" name="idPostRemove" id="idPostRemove" value="""),_display_(/*70.95*/post/*70.99*/.idPost),format.raw/*70.106*/(""">
                            <button type="submit" class="btn btn-light">
                                Remove Comment
                            </button>
                        </form>
                        """)))}/*75.27*/else/*75.32*/{_display_(Seq[Any](format.raw/*75.33*/("""
                        """),format.raw/*76.25*/("""<a onclick='sharePost("""),_display_(/*76.48*/post/*76.52*/.idPost),format.raw/*76.59*/(""")' class="btn btn-light" >
                            <span id='share"""),_display_(/*77.45*/post/*77.49*/.idPost),format.raw/*77.56*/("""'>Share</span></a>
                        """)))}),format.raw/*78.26*/("""
                    """),format.raw/*79.21*/("""</div>
                </div>
                <div id='postReply"""),_display_(/*81.36*/post/*81.40*/.idPost),format.raw/*81.47*/("""' class="border p-3 bg-lightblue" style="display: none;">
                    <div class="row">
                        <div class="col-md-12">
                          <textarea type="text" id='textReply"""),_display_(/*84.63*/post/*84.67*/.idPost),format.raw/*84.74*/("""' class="form-control" placeholder="Write a comment .." rows="3"></textarea>
                        </div>
                        <div class="col-md-12 mt-2">
                          <a onclick='submitReply("""),_display_(/*87.52*/post/*87.56*/.idPost),format.raw/*87.63*/(""")' class="btn btn-success btn-block">Send</a>
                        </div>
                    </div>
                </div>
                <div id='commentPost"""),_display_(/*91.38*/post/*91.42*/.idPost),format.raw/*91.49*/("""' class="card-body px-0 pb-0 d-flex flex-column align-items-start"></div>
            </div>
        """)))}),format.raw/*93.10*/("""
        """),format.raw/*94.9*/("""</div>
        <div class="col-lg-4">
            <br>
            <div class="flex-md-row mb-4 box-shadow h-xl-300">
                <h2 class="mb-2 h6 font-weight-bold">
                    <p class="text-dark">Following users:</p>
                </h2>
                <div class="mb-3 d-flex align-items-center">
                    <div class="pl-3">
                        <div class="card-text text-muted small">
                            """),_display_(/*104.30*/for(user <- follows) yield /*104.50*/ {_display_(Seq[Any](format.raw/*104.52*/("""
                            """),format.raw/*105.29*/("""<a class="text-dark" href="""),_display_(/*105.56*/routes/*105.62*/.ProfileController.userProfile(user.FollowUser)),format.raw/*105.109*/(""">"""),_display_(/*105.111*/user/*105.115*/.FollowUser),format.raw/*105.126*/("""</a>
                            <br>
                            """)))}),format.raw/*107.30*/("""
                        """),format.raw/*108.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src='"""),_display_(/*115.15*/routes/*115.21*/.Assets.versioned("javascripts/personalFunctions.js")),format.raw/*115.74*/("""'></script>
""")))}))
      }
    }
  }

  def render(name:String,profile:UserProfile,follows:Seq[FollowUser],posts:Seq[Post],session:Session,flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(name,profile,follows,posts)(session,flash,request)

  def f:((String,UserProfile,Seq[FollowUser],Seq[Post]) => (Session,Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (name,profile,follows,posts) => (session,flash,request) => apply(name,profile,follows,posts)(session,flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-14T20:51:28.666
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/profile.scala.html
                  HASH: 0154f8751bcae0130ee69789de0c387fbb55fd0e
                  MATRIX: 826->35|1063->179|1090->181|1122->205|1161->207|1188->208|1562->555|1578->562|1606->569|1660->596|1695->622|1735->624|1784->645|1852->686|1867->692|1924->727|1978->763|1991->767|2030->768|2082->792|2150->833|2166->840|2194->847|2260->882|2305->899|2452->1018|2468->1024|2527->1061|2790->1297|2815->1301|2856->1314|2902->1333|2984->1406|3024->1408|3065->1421|3175->1504|3190->1510|3247->1546|3340->1621|3353->1626|3392->1627|3433->1640|3485->1665|3501->1672|3531->1681|3687->1806|3728->1819|3909->1973|3925->1980|3955->1989|4004->2010|4124->2103|4140->2110|4169->2118|4218->2139|4382->2276|4416->2294|4456->2296|4497->2309|4555->2340|4568->2344|4596->2351|4858->2586|4883->2590|4912->2591|4942->2594|4955->2598|4985->2607|5034->2628|5134->2701|5147->2705|5177->2714|5226->2735|5346->2828|5359->2832|5387->2839|5528->2953|5541->2957|5569->2964|5666->3034|5679->3038|5707->3045|5743->3054|5756->3058|5782->3063|5871->3125|5884->3129|5912->3136|6038->3235|6120->3308|6161->3310|6214->3335|6270->3364|6285->3370|6337->3401|6396->3433|6411->3439|6447->3454|6504->3483|6597->3549|6610->3553|6639->3560|6875->3778|6888->3783|6927->3784|6980->3809|7030->3832|7043->3836|7071->3843|7169->3914|7182->3918|7210->3925|7285->3969|7334->3990|7426->4055|7439->4059|7467->4066|7700->4272|7713->4276|7741->4283|7980->4495|7993->4499|8021->4506|8212->4670|8225->4674|8253->4681|8386->4783|8422->4792|8900->5242|8937->5262|8978->5264|9036->5293|9091->5320|9107->5326|9177->5373|9208->5375|9223->5379|9257->5390|9356->5457|9410->5482|9561->5605|9577->5611|9652->5664
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|37->14|38->15|39->16|40->17|40->17|40->17|49->26|49->26|50->27|51->28|51->28|51->28|52->29|53->30|53->30|53->30|55->32|55->32|55->32|56->33|56->33|56->33|56->33|58->35|59->36|62->39|62->39|62->39|63->40|65->42|65->42|65->42|66->43|73->50|73->50|73->50|74->51|74->51|74->51|74->51|78->55|78->55|78->55|78->55|78->55|78->55|79->56|81->58|81->58|81->58|82->59|84->61|84->61|84->61|86->63|86->63|86->63|87->64|87->64|87->64|87->64|87->64|87->64|88->65|88->65|88->65|90->67|90->67|90->67|91->68|91->68|91->68|91->68|92->69|92->69|92->69|93->70|93->70|93->70|93->70|98->75|98->75|98->75|99->76|99->76|99->76|99->76|100->77|100->77|100->77|101->78|102->79|104->81|104->81|104->81|107->84|107->84|107->84|110->87|110->87|110->87|114->91|114->91|114->91|116->93|117->94|127->104|127->104|127->104|128->105|128->105|128->105|128->105|128->105|128->105|128->105|130->107|131->108|138->115|138->115|138->115
                  -- GENERATED --
              */
          