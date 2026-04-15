/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Estudiante {
    private int idLector;
    private String Ci;
    private String Nombre;
    private String Direccion;
    private String Carrera;
    private int Edad;

    public Estudiante(int idLector, String Ci, String Nombre, String Direccion, String Carrera, int Edad) {
        this.idLector = idLector;
        this.Ci = Ci;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Carrera = Carrera;
        this.Edad = Edad;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idLector=" + idLector + ", Ci=" + Ci + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Carrera=" + Carrera + ", Edad=" + Edad + '}';
    }
    
    
}
