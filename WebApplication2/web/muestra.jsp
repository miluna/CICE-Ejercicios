<%-- 
    Document   : muestra
    Created on : 29-may-2018, 20:41:26
    Author     : cice
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    String nombre = request.getParameter("name");
    String numero = request.getParameter("numero-tel");
    
    List<Persona> listaPersonas = (ArrayList<Persona>) session.getAttribute("lista");
    if (listaPersonas == null) {
    listaPersonas = new ArrayList<Persona>();
    }
    
    if (nombre != null && numero != null){
        Persona p = new Persona(nombre, numero);
        listaPersonas.add(p);
        session.setAttribute("lista", listaPersonas);
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de users</h1>
        <table>
            <%if (!listaPersonas.isEmpty()){%>
            <%for(Persona p : listaPersonas){%>
            <tr>
                <td><%=p.getNombre()%></td>
                <td><%=p.getTelefono()%></td>
            </tr>
                <%}%>
            <%}%>
        </table>
    </body>
</html>
