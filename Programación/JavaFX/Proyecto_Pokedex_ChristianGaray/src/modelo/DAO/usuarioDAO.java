package modelo.DAO;

import modelo.Entidades.Usuario;
import pokedex.Controladores.instanciarEscena;
import java.sql.*;

public class usuarioDAO {
    public static boolean comprobarContrasena(String nombreUsuario, String contrasena) {
        String consulta = "select nombreUsuario, contrasena from pokedex.usuario where nombreUsuario = ?";
        try(Connection conexion = Conexion.Conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString("contrasena").equals(contrasena)) {
                    return true;
                }
            }
        }catch (SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return false;
    }

    public static Usuario obtenerUsuario(String nombreUsuario){
        Usuario usuario = new Usuario();
        String consulta = "select usur.id \"id\", usur.nombreUsuario \"nombre usuario\", usur.nombre \"nombre\", usur.apellido \"apellido\", usur.rol \"rol\", reg.nombre \"region\", tp.nombre \"tipo_pokedex\"\n" +
                "from pokedex.usuario usur\n" +
                "join pokedex.region reg\n" +
                "on usur.region_id = reg.id\n" +
                "join pokedex.tipo_pokedex tp\n" +
                "on usur.tipo_pokedex_id = tp.id where usur.nombreUsuario = ?";
        try(Connection conexion = Conexion.Conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                usuario.setId(rs.getInt("id"));
                usuario.setNombreUsuario(rs.getString("nombre usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setRol(rs.getString("rol"));
                usuario.setRegion(rs.getString("region"));
                usuario.setTipoPokedex(rs.getString("tipo_pokedex"));
            }
        }catch(SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return usuario;
    }

    public static boolean crearUsuario(String nombreUsuario,String nombre, String apellidos,  String contrasena,String confimarContrasena, String rol, int region, int tipo_pokedex){
        String consulta = "insert into pokedex.usuario(nombreUsuario, nombre, apellido, contrasena, rol, region_id, tipo_pokedex_id) values(?,?,?,?,?,?,?)";
        try(Connection conexion = Conexion.Conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta) ){
            pstmt.setString(1, nombreUsuario);
            pstmt.setString(2, nombre);
            pstmt.setString(3,apellidos);
            if(contrasena.equals(confimarContrasena)){
                pstmt.setString(4, contrasena);
                pstmt.setString(5, rol);
                pstmt.setInt(6, region);
                pstmt.setInt(7, tipo_pokedex);
                return pstmt.executeUpdate() > 0;
            }else{
                instanciarEscena.mostarError("Las contraseñas no son iguales");
            }
        }catch (SQLException e){
            System.out.println("Ha surgido un problema: "+e.getMessage());
        }
        return false;
    }
    public static boolean usuarioExiste(String nombreUsuario){
        String consulta = "select nombreUsuario from pokedex.usuario where nombreUsuario = ?";
        try(Connection conexion = Conexion.Conectar()){
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                if(rs.getString("nombreUsuario").equals(nombreUsuario)){
                    return true;
                }
            }
        }catch(SQLException e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return false;
    }
}
