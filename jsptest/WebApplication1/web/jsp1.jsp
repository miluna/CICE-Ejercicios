<%-- 
    Document   : jsp1
    Created on : 24-may-2018, 20:02:41
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
        <h1>Hello World!</h1>
        <form action="tabla.jsp" method="post">
            <input name="number" type="number" placeholder="Introduce un numero"/><br/>
            <input type="submit" name="button" value="Enviar" />
        </form>
    </body>
</html>
