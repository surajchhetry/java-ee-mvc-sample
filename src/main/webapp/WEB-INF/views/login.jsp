<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

<form action="${mvc.contextPath}/app" method="post">
    <div class="container">
        <img src="${pageContext.request.contextPath}/images/logo.png" width="80px" height="80px"/>
        <h4>Login</h4>

        <input type="text" placeholder="Username" name="uname" requied>
        <input type="password" placeholder="Password" name="psw" required>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
