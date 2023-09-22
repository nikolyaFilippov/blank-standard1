<%@ page import="by.blank.constants.JspConstants" %>
<%@ page import="by.blank.constants.AppConstants" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
        <div class="form-box">
            <h2>Login</h2>
            <form method="post" action="<c:url value="<%=AppConstants.LOGIN_CONTROLLER%>"/>">
                  <input name="<%=JspConstants.LOGIN_PARAM%>" placeholder="Login">
                <input type="password" name="<%= JspConstants.PASS_PARAM%>" placeholder="password">
                <input type="submit" value="Login">
        </form>
            <c:if test="${not emptumessage}">
                <h2 class="error">${message}</h2>
            </c:if>
        </div>

</body>
</html>
