/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Multi
 */
public class DBConnection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/bibliotecadawm";
    private static final String usuario = "root";
    private static final String contrasena = "root";
    
    public static Connection Connecting (){
        try{
            Connection conexion = DriverManager.getConnection(url,usuario,contrasena);
            return conexion;
        }catch(SQLException e){
            System.out.println("Ha surgido un problema con la conexion error:"+e.getMessage());
        }
        return null;
    }
    
}
