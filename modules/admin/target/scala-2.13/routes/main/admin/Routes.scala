// @GENERATOR:play-routes-compiler
// @SOURCE:modules/admin/conf/admin.routes

package admin

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  AdminController_0: controllers.admin.AdminController,
  // @LINE:3
  Assets_1: controllers.admin.Assets,
  // @LINE:5
  common_Routes_0: common.Routes,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    AdminController_0: controllers.admin.AdminController,
    // @LINE:3
    Assets_1: controllers.admin.Assets,
    // @LINE:5
    common_Routes_0: common.Routes
  ) = this(errorHandler, AdminController_0, Assets_1, common_Routes_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    admin.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AdminController_0, Assets_1, common_Routes_0, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.admin.AdminController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/""" + "$" + """file<.+>""", """controllers.admin.Assets.versioned(path:String = "/public/lib/admin", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assetsadmin/""" + "$" + """file<.+>""", """controllers.admin.Assets.at(path:String = "/public/lib/admin", file:String)"""),
    prefixed_common_Routes_0_3.router.documentation,
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:1
  private lazy val controllers_admin_AdminController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_admin_AdminController_index0_invoker = createInvoker(
    AdminController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.AdminController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private lazy val controllers_admin_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_admin_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """public/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private lazy val controllers_admin_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assetsadmin/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_admin_Assets_at2_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assetsadmin/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private val prefixed_common_Routes_0_3 = Include(common_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_admin_AdminController_index0_route(params@_) =>
      call { 
        controllers_admin_AdminController_index0_invoker.call(AdminController_0.index())
      }
  
    // @LINE:3
    case controllers_admin_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public/lib/admin")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_admin_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:4
    case controllers_admin_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public/lib/admin")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_admin_Assets_at2_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:5
    case prefixed_common_Routes_0_3(handler) => handler
  }
}
