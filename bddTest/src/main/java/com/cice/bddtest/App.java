package com.cice.bddtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main( String[] args ) {
        String connectionString = "jdbc:mysql://localhost:8889/test1";
        String user = "root";
        String pass = "root";


        try {
            //1º cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //2º hacemos una conexion. Se usa Connection propio de Java para que si cambiamos de proyecto nos de igual
            Connection connection = DriverManager.getConnection(connectionString, user, pass);
            //3º necesitamos una sentencia para atacar la base de datos
            Statement statement = connection.createStatement();


            //4º especificamos la peticion

            //String sql = "CREATE TABLE prueba (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(30) NOT NULL, PRIMARY KEY (id))";
            //statement.execute(sql);


            String sql = "INSERT INTO prueba (nombre) VALUES ('lukiluk')";
            for (int i = 0; i<100; i++){
                statement.execute(sql);
            }
            //String sql = "UPDATE prueba SET nombre = 'lucas' WHERE id = 3";
            //String sql = "DELETE FROM test1.prueba WHERE id = 2";

            //5º ejecutar la sentencia con executeUpdate o executeQuery si es un SELECT

            //statement.executeQuery(sql);

            //6º cerrar conexion
            statement.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
