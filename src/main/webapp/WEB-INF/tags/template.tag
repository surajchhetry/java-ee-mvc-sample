<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="${mvc.contextPath}/assets/bootstrap/css/bootstrap.min.css">
    <link href=" ${mvc.contextPath}/css/global.css" rel="stylesheet"/>
    <link href=" ${mvc.contextPath}/css/font-awasome/font-awesome.min.css" rel="stylesheet"/>
    <link href=" ${mvc.contextPath}/css/footer.css" rel="stylesheet"/>
    <link href=" ${mvc.contextPath}/css/sidebar.css" rel="stylesheet"/>
    <link rel="stylesheet" href=" ${mvc.contextPath}/assets/icons/css/font-awesome.min.css">
    <script src=" ${mvc.contextPath}/assets/bootstrap/js/jquery.js"></script>
    <script src=" ${mvc.contextPath}/assets/bootstrap/js/bootstrap.bundle.min.js"></script>

</head>

<body style="background-color: #FAFAFA">
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>

<div id="container">
    <c:if test="${not empty message and not empty message.text}">
        <div class="${message.error == true ? 'alert alert-danger':'alert alert-success'}">${message.text}</div>
    </c:if>
    <jsp:doBody/>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
