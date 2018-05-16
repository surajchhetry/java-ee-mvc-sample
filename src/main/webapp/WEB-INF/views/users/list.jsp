<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:template>
    <jsp:body>
        <div class="row">
            <div class="col-sm-6"><h4>User List:</h4></div>
            <div class="col-sm-5"></div>
            <button type="submit" class="btn btn-primary col-sm-1">Export</button>
        </div>
        <hr>
        <div class="row">
            <div class="col-sm-1"></div>
            <div clas="col-sm-4">UserName:
                <input type="text"></div>
            <div class="col-sm-5">UserId:
                <input type="number"></div>
            <div class="col-sm-3">
                <button type="button">Search</button>
            </div>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>S.N.</th>
                <th>Full Name</th>
                <th>User ID</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <td>1</td>
            <td>Ram Kumar</td>
            <td>ram@gmail.com</td>
            <td>YES</td>
            <td>
            <a href="${mvc.basePath}/users/fsdfsdf">
                Edit
            </a>
            </td>
            </tbody>
        </table>
        <div class="last" style="text-align: center">
            <label for="limit">Limit:</label>
            <select class="box">
                <option value="volvo">15</option>
                <option value="saab">14</option>
                <option value="mercedes">13</option>
                <option value="audi">12</option>
            </select>
            <button type="button" class="btn btn-primary">First</button>
            <button type="button" class="btn btn-primary">Previous</button>
            <button type="button" class="btn btn-primary">Next</button>
            <button type="button" class="btn btn-primary">Last</button>
        </div>
        </div>
    </jsp:body>
</t:template>


