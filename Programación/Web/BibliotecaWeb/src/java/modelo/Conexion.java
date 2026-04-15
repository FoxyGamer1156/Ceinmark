/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
*
* @author Julen Profe
*/
public class Conexion {
    private static final String CADENACONEXION ="jdbc:mysql://localhost:3306/bibliotecadawm?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "root";

    public static Connection conectarDB() {
        try {
            Connection conexion = DriverManager.getConnection(CADENACONEXION,USUARIO, CONTRASENIA);
            return conexion;
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la conexión a base dedatos. "+e.getMessage());
        }
        return null;
    }
}
