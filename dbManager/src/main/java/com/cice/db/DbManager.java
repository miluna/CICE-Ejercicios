package com.cice.db;

/*
    Clase encargada de generar el acceso y uso de la base de datos
 */

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DbManager {

    private final String DRIVER;
    private final String HOST;
    private final String PUERTO;
    private final String USER;
    private final String PASS;
    private final String DATABASE;
    private Connection conn;

    public DbManager(){
        this.DRIVER = "com.mysql.jdbc.Driver";
        this.HOST = "localhost";
        this.PUERTO = "8889";
        this.USER = "root";
        this.PASS = "root";
        this.DATABASE = "prueba";
    }

    public DbManager(String DRIVER, String HOST, String PUERTO, String USER, String PASS, String DATABASE) {
        this.DRIVER = DRIVER;
        this.HOST = HOST;
        this.PUERTO = PUERTO;
        this.USER = USER;
        this.PASS = PASS;
        this.DATABASE = DATABASE;
    }

    /**
     * Genera URL para conectar a base de datos mysql
     * @return
     */
    private String generarUrl(){
        String url = "jdbc:mysql://" + HOST + ":" + PUERTO + "/" + DATABASE;
        return url;
    }

    /**
     * Metodo que se utiliza para conectar contra una base de datos inicializada segun los parametros del constructor
     * @return estado de conexion (true/false)
     */
    private boolean conectarBaseDatos(){
        boolean esConectado = false;

        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(generarUrl(), USER, PASS);
            if (conn != null){
                esConectado = true;
            }
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return esConectado;
    }

    /**
     * Metodo para desconectarnos de base de datos
     * @return estado de conexion (true/false)
     */
    private boolean desconectarBaseDatos(){
        boolean esDesconectado = false;

        try {
            if (conn != null) {
                conn.close();
                esDesconectado = true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return esDesconectado;
    }

    public Map<String,String> getFromDB(String sql){
        conectarBaseDatos();

        Map<String, String> map = new HashMap<String, String>();
        try{
            ResultSet rs = conn.createStatement().executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            int numeroColumnas = rsmd.getColumnCount();

            for (int i = 0; i<numeroColumnas; i++){
                map.put(rsmd.getColumnName(i), rs.getString(i));
                //String dato = rs.getString(i);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return map;
    }
}
