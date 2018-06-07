/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cice
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        String securizedPassword = Securizer.securizePassword(request.getParameter("password"));

        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/blog_cice", "root", "root");
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, user);
            statement.setString(2, securizedPassword);
            ResultSet rs = statement.executeQuery();
            
            if (rs.first()){
                // tenemos coincidencia
                HttpSession session = request.getSession();
                session.setAttribute("user", rs.getString("id"));
                response.sendRedirect("./");
            } else {
                //403 - ACCESS DENIED
                
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
    }
}
