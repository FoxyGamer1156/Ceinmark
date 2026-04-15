package modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    private static final String url = "jdbc:mysql://localhost:3306/pokedex";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection Conectar(){
        try {
            Connection conexion = DriverManager.getConnection(url,user,password);
            return conexion;
        } catch (SQLException e) {
            System.out.println("Ha surgido un problema con la conexion error:"+e.getMessage());
        }
        return null;
    }
}