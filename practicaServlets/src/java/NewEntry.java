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
@WebServlet(urlPatterns = {"/NewEntry"})
public class NewEntry extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String subtitle = request.getParameter("subtitle");
        String text = request.getParameter("text");
        String image = request.getParameter("image");
        int user = 1;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/blog_cice", "root", "root");
            PreparedStatement st = conn.prepareStatement("INSERT INTO entradas (titulo, subtitulo, cuerpo, imagenDestacada, usuarios_idusuarios) VALUES (?, ?, ?, ?, ?)");
            st.setString(1, title);
            st.setString(2, subtitle);
            st.setString(3, text);
            st.setString(4, image);
            st.setInt(5, user);
            st.execute();
            st.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
