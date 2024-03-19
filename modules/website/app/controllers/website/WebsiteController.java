package controllers.website;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class WebsiteController extends Controller {
    public Result index() {
        return ok(views.html.indexWeb.render());
    }

}
