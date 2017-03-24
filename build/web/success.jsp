<%-- 
    Document   : success
    Created on : 24 Mar, 2017, 8:22:25 AM
    Author     : Anumey
--%>

<%@page import="dto.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login SUCCESSFULLY!</h1>
        <br/>
        <%
            User user = (User)request.getAttribute("user");
        %>
        <h1>Welcome </h1><%=user.getUserName()%>
        
    </body>
</html>
