package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Multi
 */
public class UsuarioDAO {
    public UsuarioDAO() {
    }
    public Usuario obtenerUsuarioPorLogin(String email, String contrasena){
        Usuario usur = new Usuario();
        String sqlSelect = "select * from usuario where email like (?) and password like (?)";
        try(Connection conexion = Conexion.conectarDB(); PreparedStatement pstmt = conexion.prepareStatement(sqlSelect)){
           pstmt.setString(1, email);
           pstmt.setString(2, contrasena);
           ResultSet rs = pstmt.executeQuery();
           if(rs.next()){
               usur.setEmail(email);
               usur.setPassword(contrasena);
               usur.setIdLector(rs.getInt("idLector"));
               usur.setIdUsuario(rs.getInt("idUsuario"));
               usur.setRol(rs.getString("rol"));
               return usur;
           }    
        } catch (SQLException e){
            System.out.println("Ha habido un error en la base de datos: " +e.getMessage());
        }
        return usur = null;
    }
    
}
