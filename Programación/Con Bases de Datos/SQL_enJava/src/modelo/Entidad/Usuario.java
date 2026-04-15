/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Entidad;

/**
 *
 * @author Multi
 */
public class Usuario {
    private int idUsuario;
    private int idLector;
    private String email;
    private String contrasena;
    private String rol;

    public Usuario(int idUsuario, int idLector, String email, String contrasena, String rol) {
        this.idUsuario = idUsuario;
        this.idLector = idLector;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLector() {
        return idLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idLector=" + idLector + ", email=" + email + ", contrasena=" + contrasena + ", rol=" + rol + '}';
    }
}
