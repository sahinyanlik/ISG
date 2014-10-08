package controllers;

import models.Birim;
import models.User;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.data.Form.form;

/**
 * Created by mtrcm021 on 09/23/2014.
 * sy
 */
public class Users extends Controller {

    static Form<User> usersForm = form(User.class);

    public static Result index() {

        Birim a = new Birim();
        a.birimAdi="sahinyanlik";
        a.birimAdresi = "Test deneme";
        a.save();

        List<Birim> tasks = Birim.find.all();
        //return ok(users.render(String.valueOf("ok")));
        return ok(views.html.users.render("ok"));
    }

    public static Result get(String id){
        return ok(index.render("test"));
    }

    public static Result editUser(){
        return ok("test");
    }

    public static Result edit(String id){
        return ok(index.render(((String)id)));
    }

    public static Result delete(Long id){
        return ok(index.render("te  st"+id));
    }



    public static Result save(){


        Form<User> boundForm = usersForm.bindFromRequest();
        if (boundForm.hasErrors()){
            // return badRequest(users.render(boundForm));
        } else {
            User user = boundForm.get();

        }


        return ok(index.render(("ok")));
    }


    public static Result allUsers(){

    }
}
