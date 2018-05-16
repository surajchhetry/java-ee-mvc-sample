package ee.jakarta.mvc.models;

import javax.inject.Named;
import javax.mvc.annotation.RedirectScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RedirectScoped
@Named("error")
public class Error implements Serializable {

    private Map<String,String> fileds;

    public Error() {
        this.fileds = new HashMap<>();
    }


    public Map<String, String> getFileds() {
        return fileds;
    }

    public void addMessage(String filed,String message){
        this.fileds.put(filed,message);
    }



    public boolean isError(){
        return !this.fileds.isEmpty();
    }
}
