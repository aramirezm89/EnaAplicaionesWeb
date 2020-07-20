/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Antonio
 */

public class Conexion {

    private String url = "jdbc:mysql://localhost:3306/requerimiento?zeroDateTimeBehavior=convertToNull";
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String pass = "";
    private Connection conexion;

    public void Conectar() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conexion = DriverManager.getConnection(url, user, pass);
    }

    public Connection getConexion() {
        return conexion;
    }

    public void Desconectar() throws ClassNotFoundException, SQLException {

        conexion.close();
    }
    
}
   

