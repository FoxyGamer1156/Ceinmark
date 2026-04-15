/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAOS;

import java.sql.*;
import java.util.ArrayList;
import modelo.Entidad.Libro;

/**
 *
 * @author Multi
 */
public class LibroDAO {

    public static ArrayList<Libro> obtenerListaLibrosCompleto(){
        ArrayList<Libro> listaLibros = new ArrayList<>();
        String consulta = "select * from libro";
        try(Connection conexion = DBConnection.Connecting()){
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            while(rs.next()){
                listaLibros.add(new Libro(rs.getInt("idLibro"),rs.getString("Titulo"),rs.getString("Editorial"),rs.getString("Area")));
            }
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return listaLibros;
    }
    public static Libro getLibroById(int id){
        Libro nuevoLibro = new Libro();
        String consulta = "select * from libro where idLibro = ?";
        try(Connection conexion = DBConnection.Connecting();PreparedStatement pstmt = conexion.prepareStatement(consulta))
        {
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                nuevoLibro.setIdLibro(id);
                nuevoLibro.setTitulo(rs.getString("Titulo"));
                nuevoLibro.setEditorial(rs.getString("Editorial"));
                nuevoLibro.setArea(rs.getString("Area"));
            }
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return nuevoLibro;
    }
    public static boolean alta(Libro libro){
        boolean confirmacion = false;
        String consulta = "insert into libro(Titulo,Editorial,Area) values (?,?,?)";
        try (Connection conexion = DBConnection.Connecting();PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getEditorial());
            pstmt.setString(3, libro.getArea());
            int filasAfectadas = pstmt.executeUpdate();
            return confirmacion  = (filasAfectadas == 1);
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return confirmacion;
    }
    public static boolean baja(int idLibro){
        boolean confirmacion = false;
        String consulta = "delete from libro where idLibro = ?";
        try (Connection conexion = DBConnection.Connecting();PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setInt(1, idLibro);
            int filasAfectadas = pstmt.executeUpdate();
            return confirmacion  = (filasAfectadas == 1);
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return confirmacion;
    }
    public static boolean modificacion(Libro libro){
        boolean confirmacion = false;
        String consulta = "Update libro Set Titulo = ?,Editorial = ?,Area = ? where idLibro = ?";
        try (Connection conexion = DBConnection.Connecting();PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setString(1, libro.getTitulo());
            pstmt.setString(2, libro.getEditorial());
            pstmt.setString(3, libro.getArea());
            pstmt.setInt(4, libro.getIdLibro());
            int filasAfectadas = pstmt.executeUpdate();
            return confirmacion  = (filasAfectadas == 1);
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return confirmacion;
    }

}
