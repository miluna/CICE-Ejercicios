/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cice
 */
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        // Deberia usarse Apache commons como minimo => DigestUtils.sha256Hex()
        String securedPassword = Securizer.securizePassword(request.getParameter("password"));
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/blog_cice", "root", "root");
            PreparedStatement st = conn.prepareStatement("INSERT INTO usuarios (username, password, email, name, surname) VALUES (?, ?, ?, ?, ?)");
            st.setString(1, user);
            st.setString(2, securedPassword);
            st.setString(3, email);
            st.setString(4, name);
            st.setString(5, surname);
            
            st.execute();
            st.close();
            conn.close();
        } catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
    }

}
