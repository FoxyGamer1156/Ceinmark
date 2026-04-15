/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Resena {
    private int idResena;
    private int idLector;
    private int idLibro;
    private int Puntuacion;
    private String Comentario;

    public Resena(int idResena, int idLector, int idLibro, int Puntuacion, String Comentario) {
        this.idResena = idResena;
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.Puntuacion = Puntuacion;
        this.Comentario = Comentario;
    }

    public int getIdResena() {
        return idResena;
    }

    public void setIdResena(int idResena) {
        this.idResena = idResena;
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

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    @Override
    public String toString() {
        return "Resena{" + "idResena=" + idResena + ", idLector=" + idLector + ", idLibro=" + idLibro + ", Puntuacion=" + Puntuacion + ", Comentario=" + Comentario + '}';
    }
    
    
}
