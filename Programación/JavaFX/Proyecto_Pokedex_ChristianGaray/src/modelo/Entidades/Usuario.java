package modelo.Entidades;

/**
 *
 * @author foxyg
 */
public class Usuario {
    private int id;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String rol;
    private String region;
    private String tipoPokedex;

    public Usuario(int id, String nombreUsuario, String nombre, String apellido, String rol, String region, String tipoPokedex) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.region = region;
        this.tipoPokedex = tipoPokedex;
    }
    public Usuario() {
        this.id = 0;
        this.nombreUsuario = "";
        this.nombre = "";
        this.apellido = "";
        this.rol = "";
        this.region = "";
        this.tipoPokedex = "";
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public String getRegion() {
        return region;
    }

    public String getTipoPokedex() {
        return tipoPokedex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTipoPokedex(String tipoPokedex) {
        this.tipoPokedex = tipoPokedex;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", region=" + region + ", tipoPokedex=" + tipoPokedex + '}';
    }
    
}
