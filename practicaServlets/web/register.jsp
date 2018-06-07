<%-- 
    Document   : register
    Created on : 05-jun-2018, 20:53:50
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
        <h1>Register</h1>
        <form action="Register"  method="POST">
            <input type="text" name="username" placeholder="User name"/>
            <input type="password" name="password" placeholder="Password"/>
            <br>
            <input type="email" name="email" placeholder="Email"/>  
            <input type="text" name="name" placeholder="Name"/>
            <input type="text" name="surname" placeholder="Surname"/>  
            <br>
            <input type="submit" value="Send"/>
        </form>
    </body>
</html>
