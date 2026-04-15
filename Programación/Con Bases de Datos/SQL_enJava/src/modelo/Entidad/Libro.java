/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Libro {
    private int idLibro;
    private String Titulo;
    private String Editorial;
    private String Area;

    public Libro(){
    }
    public Libro(int idLibro, String Titulo, String Editorial, String area) {
        this.idLibro = idLibro;
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Area = Area;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", Titulo=" + Titulo + ", Editorial=" + Editorial + ", Area=" + Area + '}';
    }
    
    
}
