<%-- 
    Document   : tabla
    Created on : 24-may-2018, 20:16:16
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%int numero = Integer.parseInt(request.getParameter("number"));%>
        <h1>Tabla del <%=numero%></h1>

            <%for(int i = 0; i <=10; i++){%>
            <h3><%=numero%> x <%=i%> = <%=i*numero%></h3>
            <%}%>
    </body>
</html>
