// @GENERATOR:play-routes-compiler
// @SOURCE:modules/admin/conf/admin.routes

package controllers.admin;

import admin.RoutesPrefix;

public class routes {
  
  public static final controllers.admin.ReverseAdminController AdminController = new controllers.admin.ReverseAdminController(RoutesPrefix.byNamePrefix());
  public static final controllers.admin.ReverseAssets Assets = new controllers.admin.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.admin.javascript.ReverseAdminController AdminController = new controllers.admin.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
    public static final controllers.admin.javascript.ReverseAssets Assets = new controllers.admin.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
