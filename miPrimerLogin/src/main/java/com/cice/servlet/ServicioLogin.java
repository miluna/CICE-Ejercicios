package com.cice.servlet;

//import com.cice.db.DbManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class ServicioLogin extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Llamando a doPost");
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        PrintWriter writer = resp.getWriter();
        // HACER UN REGISTRO EN DB
        //String sql = "INSERT INTO usuarios VALUES (null, '" + user +"', '" + pass + "')";

        /*
        DbManager manager = new DbManager();
        manager.insertUpdateErase(sql);
        */

        String sql = "SELECT * FROM usuarios WHERE username = '" + user + "' AND password = '" + pass + "'";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/test1", "root", "root");
            Statement statement = conn.createStatement();

            //para hacer registro
            //statement.executeUpdate(sql);


            //para hacer un login
            ResultSet rs = statement.executeQuery(sql);
            if (rs.first()){
                // tenemos coincidencia
                writer.print("Welcome madafaka");
            } else {
                writer.print("403 - ACCESS DENIED");
            }
            rs.close();
            writer.close();

            statement.close();
            conn.close();
        } catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
    }
}
