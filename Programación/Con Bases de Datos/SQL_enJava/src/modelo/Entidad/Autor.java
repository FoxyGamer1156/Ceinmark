/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Autor {
    private int idAutor;
    private String Nombre;
    private String Nacionalidad;

    public Autor(int idAutor, String Nombre, String Nacionalidad) {
        this.idAutor = idAutor;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + '}';
    }
    
    
}
