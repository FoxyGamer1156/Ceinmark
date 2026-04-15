/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Multi
 */
public class Usuario {
    private int idUsuario;
    private int idLector;
    private String email;
    private String password;
    private String rol;

    public Usuario(int idUsuario, int idLector, String email, String password, String rol) {
        this.idUsuario = idUsuario;
        this.idLector = idLector;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
    public Usuario() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idLector=" + idLector + ", email=" + email + ", password=" + password + ", rol=" + rol + '}';
    }
    
    
}
