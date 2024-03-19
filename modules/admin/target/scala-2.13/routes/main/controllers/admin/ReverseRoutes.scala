// @GENERATOR:play-routes-compiler
// @SOURCE:modules/admin/conf/admin.routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.admin {

  // @LINE:1
  class ReverseAdminController(_prefix: => String) {
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
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/lib/admin"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:4
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/lib/admin"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assetsadmin/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
