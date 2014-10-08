package controllers;

import models.User;
import play.*;

import play.data.Form;
import play.mvc.*;


import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("test"));
    }

    public static Result get(){
        return ok(index.render("test"));
    }

    public static Result edit(){
        return ok("test");
    }

    public static Result edit(String id){
        return ok(index.render(((String)id)));
    }

    public static Result delete(String id){
        return ok(index.render(((String)id)));
    }

    public static Result save(){
        return ok("save");
    }

    public static Result login(){ return ok(login.render(Form.form(Login.class)));}


    public static Result authenticate() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                    routes.Application.index()
            );
        }
    }
    /*
    public String validate() {
        if (User.authenticate(email, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }
    */

    /* Login icin */

    public static class Login {
        public String email;
        public String password;

    }


}
