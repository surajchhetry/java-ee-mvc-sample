package ee.jakarta.mvc.models;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class UserModel {

    @MvcBinding
    @FormParam("fullName")
    @NotBlank(message = "Full Name is empty")
    @Size(max = 50)
    private String name;
    @FormParam("userId")
    private String userId;
    @FormParam("password")
    private String password;
    @FormParam("confirmPassword")
    private String confirmPassword;
    @FormParam("role")
    private String role;

    public UserModel(String title) {
        this.name = title;
    }

    public UserModel() {
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
