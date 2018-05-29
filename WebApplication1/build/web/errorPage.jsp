<%-- 
    Document   : jsp1
    Created on : 24-may-2018, 20:02:41
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ERROR!</h1>
        <h6> <%=exception.getLocalizedMessage()%></h6>
    </body>
</html>
