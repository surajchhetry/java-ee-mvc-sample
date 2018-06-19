package ee.jakarta.mvc.controllers;

import ee.jakarta.mvc.utils.ControllerUtils;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mvc.MvcContext;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.logging.Logger;

@Path("/")
@Controller
@Named
@RequestScoped
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class.getName());

    private MvcContext mvcContext;

    public IndexController() {
    }

    @Inject
    public IndexController(MvcContext mvcContext) {
        this.mvcContext = mvcContext;
    }

    @GET
    @View("login.jsp")
    public void displayLoginView(){}

    @POST
    public Response onLogin(@FormParam("username") String username, @FormParam("password") String password){
        return Response.seeOther( URI.create(mvcContext.getApplicationPath()+"/home")).build();

    }

    @GET
    @Path("home")
    @View("home.jsp")
    public void loadHomeView(){
    }

}
