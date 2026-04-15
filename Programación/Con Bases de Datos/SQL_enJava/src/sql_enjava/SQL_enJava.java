/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sql_enjava;

import java.sql.Connection;
import modelo.DAOS.DBConnection;
import modelo.DAOS.LibroDAO;
import modelo.Entidad.Libro;

/**
 *
 * @author Multi
 */
public class SQL_enJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro = LibroDAO.getLibroById(10);
        System.out.println(libro.toString());
        
    }
    
}
