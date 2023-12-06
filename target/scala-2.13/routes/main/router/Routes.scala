// @GENERATOR:play-routes-compiler
// @SOURCE:D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/conf/routes
// @DATE:Sun Dec 19 00:43:14 CET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_7: controllers.HomeController,
  // @LINE:11
  ShareThoughtController_4: controllers.ShareThoughtController,
  // @LINE:15
  SignUpController_5: controllers.SignUpController,
  // @LINE:18
  ProfileController_0: controllers.ProfileController,
  // @LINE:21
  ConfigureController_2: controllers.ConfigureController,
  // @LINE:26
  LoginController_3: controllers.LoginController,
  // @LINE:28
  AuthenticatedUserController_1: controllers.AuthenticatedUserController,
  // @LINE:36
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_7: controllers.HomeController,
    // @LINE:11
    ShareThoughtController_4: controllers.ShareThoughtController,
    // @LINE:15
    SignUpController_5: controllers.SignUpController,
    // @LINE:18
    ProfileController_0: controllers.ProfileController,
    // @LINE:21
    ConfigureController_2: controllers.ConfigureController,
    // @LINE:26
    LoginController_3: controllers.LoginController,
    // @LINE:28
    AuthenticatedUserController_1: controllers.AuthenticatedUserController,
    // @LINE:36
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_7, ShareThoughtController_4, SignUpController_5, ProfileController_0, ConfigureController_2, LoginController_3, AuthenticatedUserController_1, Assets_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_7, ShareThoughtController_4, SignUpController_5, ProfileController_0, ConfigureController_2, LoginController_3, AuthenticatedUserController_1, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix, """controllers.HomeController.searchUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trends/""" + "$" + """hashtag<[^/]+>""", """controllers.HomeController.trends(hashtag:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likes""", """controllers.HomeController.indexOrderLike"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadShare""", """controllers.ShareThoughtController.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """share""", """controllers.ShareThoughtController.share"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shareUpdated""", """controllers.ShareThoughtController.shareUpdated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.signUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpAccount""", """controllers.SignUpController.SignUpAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """user<[^/]+>""", """controllers.ProfileController.userProfile(user:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """configure""", """controllers.ConfigureController.configurePage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.ConfigureController.upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """configureUpdated""", """controllers.ConfigureController.configureUpdated"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removePost""", """controllers.ProfileController.RemovePost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.LoginController.signInPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doSignIn""", """controllers.LoginController.signIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthenticatedUserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likePostClick/""" + "$" + """idPost<[^/]+>""", """controllers.ProfileController.likePostClick(idPost:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """followUserClick/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.followUserClick(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sharePostClick/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.sharePostClick(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showCommentClick/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.showCommentClick(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitReply/""" + "$" + """id<[^/]+>/""" + "$" + """text<[^/]+>""", """controllers.ProfileController.submitReply(id:Int, text:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 https://www.playframework.com/documentation/latest/ScalaRouting
 ~~~~
 HomePage""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_searchUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_searchUser1_invoker = createInvoker(
    HomeController_7.searchUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "searchUser",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_trends2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trends/"), DynamicPart("hashtag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_trends2_invoker = createInvoker(
    HomeController_7.trends(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "trends",
      Seq(classOf[String]),
      "GET",
      this.prefix + """trends/""" + "$" + """hashtag<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_indexOrderLike3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likes")))
  )
  private[this] lazy val controllers_HomeController_indexOrderLike3_invoker = createInvoker(
    HomeController_7.indexOrderLike,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "indexOrderLike",
      Nil,
      "GET",
      this.prefix + """likes""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ShareThoughtController_upload4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadShare")))
  )
  private[this] lazy val controllers_ShareThoughtController_upload4_invoker = createInvoker(
    ShareThoughtController_4.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShareThoughtController",
      "upload",
      Nil,
      "POST",
      this.prefix + """uploadShare""",
      """ Share a Thought page""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ShareThoughtController_share5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("share")))
  )
  private[this] lazy val controllers_ShareThoughtController_share5_invoker = createInvoker(
    ShareThoughtController_4.share,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShareThoughtController",
      "share",
      Nil,
      "GET",
      this.prefix + """share""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ShareThoughtController_shareUpdated6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shareUpdated")))
  )
  private[this] lazy val controllers_ShareThoughtController_shareUpdated6_invoker = createInvoker(
    ShareThoughtController_4.shareUpdated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShareThoughtController",
      "shareUpdated",
      Nil,
      "POST",
      this.prefix + """shareUpdated""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SignUpController_signUp7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_signUp7_invoker = createInvoker(
    SignUpController_5.signUp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "signUp",
      Nil,
      "GET",
      this.prefix + """signUp""",
      """ SignUp page""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SignUpController_SignUpAccount8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpAccount")))
  )
  private[this] lazy val controllers_SignUpController_SignUpAccount8_invoker = createInvoker(
    SignUpController_5.SignUpAccount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "SignUpAccount",
      Nil,
      "POST",
      this.prefix + """signUpAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProfileController_profile9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_profile9_invoker = createInvoker(
    ProfileController_0.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "profile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """ Profile page""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProfileController_userProfile10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("user", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_userProfile10_invoker = createInvoker(
    ProfileController_0.userProfile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "userProfile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """profile/""" + "$" + """user<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ConfigureController_configurePage11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("configure")))
  )
  private[this] lazy val controllers_ConfigureController_configurePage11_invoker = createInvoker(
    ConfigureController_2.configurePage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConfigureController",
      "configurePage",
      Nil,
      "GET",
      this.prefix + """configure""",
      """ Configure profile page""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ConfigureController_upload12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_ConfigureController_upload12_invoker = createInvoker(
    ConfigureController_2.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConfigureController",
      "upload",
      Nil,
      "POST",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ConfigureController_configureUpdated13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("configureUpdated")))
  )
  private[this] lazy val controllers_ConfigureController_configureUpdated13_invoker = createInvoker(
    ConfigureController_2.configureUpdated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConfigureController",
      "configureUpdated",
      Nil,
      "POST",
      this.prefix + """configureUpdated""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProfileController_RemovePost14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removePost")))
  )
  private[this] lazy val controllers_ProfileController_RemovePost14_invoker = createInvoker(
    ProfileController_0.RemovePost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "RemovePost",
      Nil,
      "POST",
      this.prefix + """removePost""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_signInPage15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_LoginController_signInPage15_invoker = createInvoker(
    LoginController_3.signInPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "signInPage",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """ login page""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LoginController_signIn16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doSignIn")))
  )
  private[this] lazy val controllers_LoginController_signIn16_invoker = createInvoker(
    LoginController_3.signIn,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "signIn",
      Nil,
      "POST",
      this.prefix + """doSignIn""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AuthenticatedUserController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthenticatedUserController_logout17_invoker = createInvoker(
    AuthenticatedUserController_1.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticatedUserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ProfileController_likePostClick18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likePostClick/"), DynamicPart("idPost", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_likePostClick18_invoker = createInvoker(
    ProfileController_0.likePostClick(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "likePostClick",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """likePostClick/""" + "$" + """idPost<[^/]+>""",
      """ AJAX""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ProfileController_followUserClick19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("followUserClick/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_followUserClick19_invoker = createInvoker(
    ProfileController_0.followUserClick(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "followUserClick",
      Seq(classOf[String]),
      "GET",
      this.prefix + """followUserClick/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ProfileController_sharePostClick20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sharePostClick/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_sharePostClick20_invoker = createInvoker(
    ProfileController_0.sharePostClick(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "sharePostClick",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """sharePostClick/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ProfileController_showCommentClick21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showCommentClick/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_showCommentClick21_invoker = createInvoker(
    ProfileController_0.showCommentClick(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "showCommentClick",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """showCommentClick/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ProfileController_submitReply22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitReply/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("text", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_submitReply22_invoker = createInvoker(
    ProfileController_0.submitReply(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "submitReply",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """submitReply/""" + "$" + """id<[^/]+>/""" + "$" + """text<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_7.index)
      }
  
    // @LINE:7
    case controllers_HomeController_searchUser1_route(params@_) =>
      call { 
        controllers_HomeController_searchUser1_invoker.call(HomeController_7.searchUser)
      }
  
    // @LINE:8
    case controllers_HomeController_trends2_route(params@_) =>
      call(params.fromPath[String]("hashtag", None)) { (hashtag) =>
        controllers_HomeController_trends2_invoker.call(HomeController_7.trends(hashtag))
      }
  
    // @LINE:9
    case controllers_HomeController_indexOrderLike3_route(params@_) =>
      call { 
        controllers_HomeController_indexOrderLike3_invoker.call(HomeController_7.indexOrderLike)
      }
  
    // @LINE:11
    case controllers_ShareThoughtController_upload4_route(params@_) =>
      call { 
        controllers_ShareThoughtController_upload4_invoker.call(ShareThoughtController_4.upload)
      }
  
    // @LINE:12
    case controllers_ShareThoughtController_share5_route(params@_) =>
      call { 
        controllers_ShareThoughtController_share5_invoker.call(ShareThoughtController_4.share)
      }
  
    // @LINE:13
    case controllers_ShareThoughtController_shareUpdated6_route(params@_) =>
      call { 
        controllers_ShareThoughtController_shareUpdated6_invoker.call(ShareThoughtController_4.shareUpdated)
      }
  
    // @LINE:15
    case controllers_SignUpController_signUp7_route(params@_) =>
      call { 
        controllers_SignUpController_signUp7_invoker.call(SignUpController_5.signUp)
      }
  
    // @LINE:16
    case controllers_SignUpController_SignUpAccount8_route(params@_) =>
      call { 
        controllers_SignUpController_SignUpAccount8_invoker.call(SignUpController_5.SignUpAccount)
      }
  
    // @LINE:18
    case controllers_ProfileController_profile9_route(params@_) =>
      call { 
        controllers_ProfileController_profile9_invoker.call(ProfileController_0.profile)
      }
  
    // @LINE:19
    case controllers_ProfileController_userProfile10_route(params@_) =>
      call(params.fromPath[String]("user", None)) { (user) =>
        controllers_ProfileController_userProfile10_invoker.call(ProfileController_0.userProfile(user))
      }
  
    // @LINE:21
    case controllers_ConfigureController_configurePage11_route(params@_) =>
      call { 
        controllers_ConfigureController_configurePage11_invoker.call(ConfigureController_2.configurePage)
      }
  
    // @LINE:22
    case controllers_ConfigureController_upload12_route(params@_) =>
      call { 
        controllers_ConfigureController_upload12_invoker.call(ConfigureController_2.upload)
      }
  
    // @LINE:23
    case controllers_ConfigureController_configureUpdated13_route(params@_) =>
      call { 
        controllers_ConfigureController_configureUpdated13_invoker.call(ConfigureController_2.configureUpdated)
      }
  
    // @LINE:24
    case controllers_ProfileController_RemovePost14_route(params@_) =>
      call { 
        controllers_ProfileController_RemovePost14_invoker.call(ProfileController_0.RemovePost)
      }
  
    // @LINE:26
    case controllers_LoginController_signInPage15_route(params@_) =>
      call { 
        controllers_LoginController_signInPage15_invoker.call(LoginController_3.signInPage)
      }
  
    // @LINE:27
    case controllers_LoginController_signIn16_route(params@_) =>
      call { 
        controllers_LoginController_signIn16_invoker.call(LoginController_3.signIn)
      }
  
    // @LINE:28
    case controllers_AuthenticatedUserController_logout17_route(params@_) =>
      call { 
        controllers_AuthenticatedUserController_logout17_invoker.call(AuthenticatedUserController_1.logout)
      }
  
    // @LINE:30
    case controllers_ProfileController_likePostClick18_route(params@_) =>
      call(params.fromPath[Int]("idPost", None)) { (idPost) =>
        controllers_ProfileController_likePostClick18_invoker.call(ProfileController_0.likePostClick(idPost))
      }
  
    // @LINE:31
    case controllers_ProfileController_followUserClick19_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProfileController_followUserClick19_invoker.call(ProfileController_0.followUserClick(id))
      }
  
    // @LINE:32
    case controllers_ProfileController_sharePostClick20_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_sharePostClick20_invoker.call(ProfileController_0.sharePostClick(id))
      }
  
    // @LINE:33
    case controllers_ProfileController_showCommentClick21_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_showCommentClick21_invoker.call(ProfileController_0.showCommentClick(id))
      }
  
    // @LINE:34
    case controllers_ProfileController_submitReply22_route(params@_) =>
      call(params.fromPath[Int]("id", None), params.fromPath[String]("text", None)) { (id, text) =>
        controllers_ProfileController_submitReply22_invoker.call(ProfileController_0.submitReply(id, text))
      }
  
    // @LINE:36
    case controllers_Assets_versioned23_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
