// @GENERATOR:play-routes-compiler
// @SOURCE:modules/website/conf/website.routes

package controllers.website;

import website.RoutesPrefix;

public class routes {
  
  public static final controllers.website.ReverseWebsiteController WebsiteController = new controllers.website.ReverseWebsiteController(RoutesPrefix.byNamePrefix());
  public static final controllers.website.ReverseAssets Assets = new controllers.website.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.website.javascript.ReverseWebsiteController WebsiteController = new controllers.website.javascript.ReverseWebsiteController(RoutesPrefix.byNamePrefix());
    public static final controllers.website.javascript.ReverseAssets Assets = new controllers.website.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
