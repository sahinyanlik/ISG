package controllers;

import play.*;
import play.mvc.*;

import views.html.*;


/**
 * Created by mtrcm021 on 09/23/2014.
 * sy
 */
public class Employee extends Controller {


    public static Result index() {
        return ok(employee.render("test"));
    }

    public static Result get(Long id){
        return ok(index.render("test"));
    }



    public static Result edit(Long  id){
        return ok(index.render("tt"));
    }

    public static Result editEmployee(){
        return ok(index.render("44"));
    }

    public static Result delete(Long id){
        return ok(index.render("test2"));
    }

    public static Result save(){
        return ok(index.render("ok"));
    }

}
