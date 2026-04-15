/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Prestamo {
    private int idPrestamo;
    private int idLector;
    private int idLibro;
    private String FechaPrestamo;
    private String FechaDevolucion;

    public Prestamo(int idPrestamo, int idLector, int idLibro, String FechaPrestamo, String FechaDevolucion) {
        this.idPrestamo = idPrestamo;
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.FechaPrestamo = FechaPrestamo;
        this.FechaDevolucion = FechaDevolucion;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", idLector=" + idLector + ", idLibro=" + idLibro + ", FechaPrestamo=" + FechaPrestamo + ", FechaDevolucion=" + FechaDevolucion + '}';
    }
    
}
