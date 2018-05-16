package ee.jakarta.mvc.controllers;


import ee.jakarta.mvc.models.Error;
import ee.jakarta.mvc.models.Message;
import ee.jakarta.mvc.models.UserModel;
import ee.jakarta.mvc.services.TodoService;
import ee.jakarta.mvc.utils.ControllerUtils;
import org.apache.commons.lang3.StringUtils;
import sun.rmi.runtime.Log;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.mvc.annotation.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("users")
@Controller
@Named
@RequestScoped
public class UserController {
    private TodoService todoService;
    private Message message;
    private Logger logger = Logger.getLogger(UserController.class.getSimpleName());
    //private UserModel userModel;
    private Models userModel;
    private BindingResult bindingResult;
    private Error error;

    // For JAX-RS
    public UserController() {
    }

    @Inject
    public UserController(TodoService todoService,Message message,Models userModel,BindingResult bindingResult,Error error) {
        this.todoService = todoService;
        this.message = message;
        this.userModel = userModel;
        this.bindingResult = bindingResult;
        this.error = error;
    }

    @View("users/list.jsp")
    @GET
    public void getAll(){

    }

    @View("users/add.jsp")
    @GET
    @Path("new")
    public void addNewTodoPage(){
    }

    @View("users/view.jsp")
    @GET
    @Path("{userid}")
    public void showUser(@PathParam("userid") String userId){
        this.logger.info(" USer ID :: " + userId);
        this.userModel.put("userModel",new UserModel("JAKASH ...."));
    }

    @POST
    @Path("new")
    @CsrfValid
    public Response addNewTodo(@BeanParam UserModel userModel){
        this.logger.info(" SUBMITTED :: "+userModel.toString());
        if(StringUtils.isBlank(userModel.getName())) {
             error.addMessage("fullName", "Is blank");
        //    this.userModel.put("error", error);
            return Response.ok(ControllerUtils.REDIRECT_TO + "users/new").build();
        }else {
            this.message.addInfoMessage("User added successfully");
            return Response.ok(ControllerUtils.REDIRECT_TO + "users").build();
        }
    }
}
