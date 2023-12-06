// @GENERATOR:play-routes-compiler
// @SOURCE:D:/COMPUTER SCIENCE/1 SEMESTER/software architecture/asignment2Project/conf/routes
// @DATE:Sun Dec 19 00:43:14 CET 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:36
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:28
  class ReverseAuthenticatedUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:11
  class ReverseShareThoughtController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def upload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "uploadShare")
    }
  
    // @LINE:13
    def shareUpdated(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "shareUpdated")
    }
  
    // @LINE:12
    def share(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "share")
    }
  
  }

  // @LINE:18
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def submitReply(id:Int, text:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitReply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("text", text)))
    }
  
    // @LINE:24
    def RemovePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "removePost")
    }
  
    // @LINE:32
    def sharePostClick(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sharePostClick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:18
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:31
    def followUserClick(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "followUserClick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:19
    def userProfile(user:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:33
    def showCommentClick(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showCommentClick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:30
    def likePostClick(idPost:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "likePostClick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("idPost", idPost)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def trends(hashtag:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "trends/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hashtag", hashtag)))
    }
  
    // @LINE:7
    def searchUser(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def indexOrderLike(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "likes")
    }
  
  }

  // @LINE:26
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doSignIn")
    }
  
    // @LINE:26
    def signInPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:21
  class ReverseConfigureController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def upload(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:23
    def configureUpdated(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "configureUpdated")
    }
  
    // @LINE:21
    def configurePage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "configure")
    }
  
  }

  // @LINE:15
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def signUp(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:16
    def SignUpAccount(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUpAccount")
    }
  
  }


}
