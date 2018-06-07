<%-- 
    Document   : login
    Created on : 05-jun-2018, 20:29:09
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>

        <form action="Login"  method="POST">
            <input type="text" name="username" placeholder="User name"/>
            <input type="password" name="password" placeholder="Password"/>            
            <input type="submit" value="Send"/>
        </form>
        <a href="./register.jsp">Register</a>
    </body>
</html>
