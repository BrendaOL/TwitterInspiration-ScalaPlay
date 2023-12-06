// @GENERATOR:play-routes-compiler
// @SOURCE:D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/conf/routes
// @DATE:Sun Dec 19 00:43:14 CET 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:36
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseAuthenticatedUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticatedUserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseShareThoughtController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShareThoughtController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadShare"})
        }
      """
    )
  
    // @LINE:13
    def shareUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShareThoughtController.shareUpdated",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shareUpdated"})
        }
      """
    )
  
    // @LINE:12
    def share: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShareThoughtController.share",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "share"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def submitReply: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.submitReply",
      """
        function(id0,text1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitReply/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("text", text1))})
        }
      """
    )
  
    // @LINE:24
    def RemovePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.RemovePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removePost"})
        }
      """
    )
  
    // @LINE:32
    def sharePostClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.sharePostClick",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sharePostClick/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:18
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:31
    def followUserClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.followUserClick",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "followUserClick/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:19
    def userProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.userProfile",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("user", user0))})
        }
      """
    )
  
    // @LINE:33
    def showCommentClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.showCommentClick",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showCommentClick/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:30
    def likePostClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.likePostClick",
      """
        function(idPost0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "likePostClick/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("idPost", idPost0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def trends: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.trends",
      """
        function(hashtag0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "trends/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hashtag", hashtag0))})
        }
      """
    )
  
    // @LINE:7
    def searchUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.searchUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def indexOrderLike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indexOrderLike",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "likes"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doSignIn"})
        }
      """
    )
  
    // @LINE:26
    def signInPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.signInPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseConfigureController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConfigureController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:23
    def configureUpdated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConfigureController.configureUpdated",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "configureUpdated"})
        }
      """
    )
  
    // @LINE:21
    def configurePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConfigureController.configurePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "configure"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:16
    def SignUpAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.SignUpAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpAccount"})
        }
      """
    )
  
  }


}
