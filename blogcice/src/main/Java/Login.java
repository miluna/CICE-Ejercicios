import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/prueba", "root", "root");

            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM usuarios WHERE user = '" + user + "' and pass = '" + pass + "'";
            ResultSet rs = statement.executeQuery(sql);

            if (rs.first()) {
                //usuario encontrado
                //TODO: RESPONDER CON LOGIN CORRECTO
            } else {
                //usuario no encontrado
                //TODO: RESPONDER CON LOGIN INCORRECTO
            }

            rs.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
