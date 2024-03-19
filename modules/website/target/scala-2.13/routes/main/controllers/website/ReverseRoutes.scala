// @GENERATOR:play-routes-compiler
// @SOURCE:modules/website/conf/website.routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.website {

  // @LINE:1
  class ReverseWebsiteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:3
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/lib/website"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:4
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/lib/website"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assetswebsite/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
