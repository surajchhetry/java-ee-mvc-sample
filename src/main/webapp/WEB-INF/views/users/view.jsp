<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:template>
    <jsp:body>
        <form action="" method="post">
            <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}"/>
            <h4>View User:</h4>

            <div class="form-group row">
                <label for="fullName" class="col-sm-2 col-form-label">Full Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="fullName" placeholder="Enter full name" name="fullName" value="${userModel.name}">
                    <span ></span>
                </div>
            </div>
            <div class="form-group row">
                <label for="userId" class="col-sm-2 col-form-label">User ID:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="userId" placeholder="Enter User ID" name="userId">
                </div>
            </div>

            <div class="form-group row">
                <label for="password"  class="col-sm-2 col-form-label">Password:</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
                </div>
            </div>
            <div class="form-group row">
                <label for="confirmPassword" class="col-sm-2 col-form-label">Confirm Password:</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="confirmPassword" placeholder="Enter password" name="confirmPassword">
                </div>
            </div>
            <div class="form-group row">
                <label for="role"class="col-sm-2 col-form-label"> Role:</label>
                <div class="col-sm-10">
                    <select class="custom-select" id="role" name="role">
                        <option selected>Select Role..</option>
                        <option value="mgr">Manager</option>
                        <option value="admin">Admin</option>
                        <option value="reporter">Reporter</option>
                    </select>
                </div>

            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-primary">Cancel</button>
        </form>

    </jsp:body>
</t:template>