// @GENERATOR:play-routes-compiler
// @SOURCE:modules/common/conf/common.routes

package controllers.common;

import common.RoutesPrefix;

public class routes {
  
  public static final controllers.common.ReverseAssets Assets = new controllers.common.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.common.javascript.ReverseAssets Assets = new controllers.common.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
