
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

object mainWeb extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/controllers/*8.65*/.common.routes.Assets.at("stylesheets/main.css")),format.raw/*8.113*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/controllers/*9.70*/.common.routes.Assets.at("images/favicon.png")),format.raw/*9.116*/("""">
    </head>
    <body>
        """),format.raw/*13.32*/("""
        """),_display_(/*14.10*/content),format.raw/*14.17*/("""

        """),format.raw/*16.9*/("""<script src=""""),_display_(/*16.23*/controllers/*16.34*/.common.routes.Assets.at("javascripts/main.js")),format.raw/*16.81*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: modules/website/app/views/mainWeb.scala.html
                  HASH: 690f8574d246b7b71888ea3e518adac39407056a
                  MATRIX: 736->1|860->32|887->33|966->138|1001->147|1035->155|1060->160|1148->222|1167->233|1236->281|1323->342|1342->353|1409->399|1471->523|1508->533|1536->540|1573->550|1614->564|1634->575|1702->622
                  LINES: 21->1|26->2|27->3|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|36->13|37->14|37->14|39->16|39->16|39->16|39->16
                  -- GENERATED --
              */
          