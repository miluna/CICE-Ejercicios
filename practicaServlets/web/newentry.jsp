<%-- 
    Document   : entrada
    Created on : 07-jun-2018, 19:37:48
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  String idUsuario = (String) session.getAttribute("user");
  if (idUsuario == null){
      response.sendRedirect("./login.jsp");
  }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nueva Entrada</h1>
        <form action="NewEntry"  method="POST">
            <input type="text" name="title" placeholder="Title"/>
            <input type="text" name="subtitle" placeholder="Subtitle here"/>
            <br/>
            <textarea type="text" name="text" cols="50" rows="10">
            </textarea>
            <input type="file" name="image" accept=".jpg, .jpeg, .png" multiple/>
            <br/>
            <input type="submit" value="Send"/>
        </form>
    </body>
</html>
