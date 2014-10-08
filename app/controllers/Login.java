package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * Created by mtrcm021 on 09/23/2014.
 * sy
 */
public class Login extends Controller {

    public static Result index() {
        return ok(index.render("test"));
    }
}
