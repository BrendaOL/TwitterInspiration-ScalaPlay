
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Session,Html,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, session: Session)(content: Html)(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.72*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport'/>
    <!-- Google Font -->
    <link href="//fonts.googleapis.com/css?family=Playfair+Display:400,700|Source+Sans+Pro:400,600,700" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
</head>

<body>
<!--------------------------------------
NAVBAR
--------------------------------------->
<div id="container">
<nav class="topnav navbar navbar-expand-lg navbar-light bg-white fixed-top">
    <div class="container">
        <img style="width:50px" src='"""),_display_(/*30.39*/routes/*30.45*/.Assets.versioned("images/logo2.png")),format.raw/*30.82*/("""'/>
        <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse" id="navbarColor02" style="">
            """),_display_(/*35.14*/if(!session.get(models.Global.SESSION_USERNAME).isEmpty)/*35.70*/ {_display_(Seq[Any](format.raw/*35.72*/("""
            """),format.raw/*36.13*/("""<ul class="navbar-nav mr-auto d-flex align-items-center">
                <li class="nav-item"><a class="nav-link" href=""""),_display_(/*37.65*/routes/*37.71*/.HomeController.index()),format.raw/*37.94*/("""">Explore <span class="sr-only">(current)</span></a></li>
                <li class="nav-item"><a class="nav-link" href=""""),_display_(/*38.65*/routes/*38.71*/.ShareThoughtController.share()),format.raw/*38.102*/("""">Share a Thought</a></li>
                <li class="nav-item"><a class="nav-link" href=""""),_display_(/*39.65*/routes/*39.71*/.ProfileController.profile()),format.raw/*39.99*/("""">Profile</a></li>
            </ul>
            """)))}),format.raw/*41.14*/("""
            """),format.raw/*42.13*/("""<ul class="navbar-nav ml-auto d-flex align-items-center">
                """),_display_(/*43.18*/if(session.get(models.Global.SESSION_USERNAME).isEmpty)/*43.73*/ {_display_(Seq[Any](format.raw/*43.75*/("""
                """),format.raw/*44.17*/("""<li class="nav-item highlight">
                    <a class="nav-link" href=""""),_display_(/*45.48*/routes/*45.54*/.LoginController.signInPage()),format.raw/*45.83*/("""">Login</a>
                </li>
                """)))}/*47.19*/else/*47.24*/{_display_(Seq[Any](format.raw/*47.25*/("""
                """),format.raw/*48.17*/("""<li class="nav-item highlight">
                    <a class="nav-link" href=""""),_display_(/*49.48*/routes/*49.54*/.AuthenticatedUserController.logout()),format.raw/*49.91*/("""">Logout</a>
                </li>
                """)))}),format.raw/*51.18*/("""
            """),format.raw/*52.13*/("""</ul>
        </div>
    </div>
</nav>
<!-- End Navbar -->
"""),_display_(/*57.2*/if(!flash.get("info").isEmpty)/*57.32*/{_display_(Seq[Any](format.raw/*57.33*/("""
"""),format.raw/*58.1*/("""<div class="alert alert-secondary" role="alert">
    <i class="fas fa-bullhorn"></i> """),_display_(/*59.38*/flash/*59.43*/.get("info")),format.raw/*59.55*/(""" """),format.raw/*59.56*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">×</span>
</button>
</div>
""")))}),format.raw/*63.2*/("""
"""),_display_(/*64.2*/if(!flash.get("success").isEmpty)/*64.35*/{_display_(Seq[Any](format.raw/*64.36*/("""
"""),format.raw/*65.1*/("""<div class="alert alert-primary" role="alert">
    <i class="fas fa-bullhorn"></i> """),_display_(/*66.38*/flash/*66.43*/.get("success")),format.raw/*66.58*/(""" """),format.raw/*66.59*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">×</span>
</button>
</div>
""")))}),format.raw/*70.2*/("""
"""),_display_(/*71.2*/if(!flash.get("error").isEmpty)/*71.33*/{_display_(Seq[Any](format.raw/*71.34*/("""
"""),format.raw/*72.1*/("""<div class="alert alert-danger" role="alert">
    <i class="fas fa-bullhorn"></i> """),_display_(/*73.38*/flash/*73.43*/.get("error")),format.raw/*73.56*/(""" """),format.raw/*73.57*/("""<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">×</span>
</button>
</div>
""")))}),format.raw/*77.2*/("""
"""),_display_(/*78.2*/content),format.raw/*78.9*/("""

"""),format.raw/*80.1*/("""<!--------FOOTER---------------------->
<!--div class="container mt-5">
    <footer class="bg-white border-top p-3 text-muted small">
        <div class="row align-items-center justify-content-between">
            <div>
                <span class="navbar-brand mr-2"><strong>Mundana</strong></span> Copyright &copy;
                <script>document.write(new Date().getFullYear())</script>
                . All rights reserved.
            </div>
            <div>
                Made with <a target="_blank" class="text-secondary font-weight-bold" href="https://www.wowthemes.net/mundana-free-html-bootstrap-template/">Mundana Theme</a> by WowThemes.net.
            </div>
        </div>
    </footer>
</div-->
</div>
<!-- End Footer -->
<!--------JAVASCRIPTS------------>
<script src='"""),_display_(/*98.15*/routes/*98.21*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*98.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*99.15*/routes/*99.21*/.Assets.versioned("javascripts/popper.min.js")),format.raw/*99.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*100.15*/routes/*100.21*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*100.70*/("""' type="text/javascript"></script>
<script src='"""),_display_(/*101.15*/routes/*101.21*/.Assets.versioned("javascripts/functions.js")),format.raw/*101.66*/("""' type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,session:Session,content:Html,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title,session)(content)(flash)

  def f:((String,Session) => (Html) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (title,session) => (content) => (flash) => apply(title,session)(content)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-13T23:24:01.260
                  SOURCE: D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/app/views/main.scala.html
                  HASH: 13d5ad4fb4ed7cdf97aac1f72b141bf8a9779ad1
                  MATRIX: 1001->261|1166->331|1196->335|1307->419|1333->424|1488->552|1503->558|1565->599|2381->1388|2396->1394|2454->1431|2849->1799|2914->1855|2954->1857|2996->1871|3146->1994|3161->2000|3205->2023|3355->2146|3370->2152|3423->2183|3542->2275|3557->2281|3606->2309|3689->2361|3731->2375|3834->2451|3898->2506|3938->2508|3984->2526|4091->2606|4106->2612|4156->2641|4228->2695|4241->2700|4280->2701|4326->2719|4433->2799|4448->2805|4506->2842|4591->2896|4633->2910|4724->2975|4763->3005|4802->3006|4831->3008|4945->3095|4959->3100|4992->3112|5021->3113|5188->3250|5217->3253|5259->3286|5298->3287|5327->3289|5439->3374|5453->3379|5489->3394|5518->3395|5685->3532|5714->3535|5754->3566|5793->3567|5822->3569|5933->3653|5947->3658|5981->3671|6010->3672|6177->3809|6206->3812|6233->3819|6264->3823|7102->4634|7117->4640|7184->4686|7261->4736|7276->4742|7343->4788|7421->4838|7437->4844|7508->4893|7586->4943|7602->4949|7669->4994
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|54->30|54->30|54->30|59->35|59->35|59->35|60->36|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|65->41|66->42|67->43|67->43|67->43|68->44|69->45|69->45|69->45|71->47|71->47|71->47|72->48|73->49|73->49|73->49|75->51|76->52|81->57|81->57|81->57|82->58|83->59|83->59|83->59|83->59|87->63|88->64|88->64|88->64|89->65|90->66|90->66|90->66|90->66|94->70|95->71|95->71|95->71|96->72|97->73|97->73|97->73|97->73|101->77|102->78|102->78|104->80|122->98|122->98|122->98|123->99|123->99|123->99|124->100|124->100|124->100|125->101|125->101|125->101
                  -- GENERATED --
              */
          