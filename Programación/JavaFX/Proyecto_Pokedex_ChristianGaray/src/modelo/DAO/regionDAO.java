package modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class regionDAO {
    public static List<String> regiones(){
        ArrayList<String> regiones = new ArrayList<>();
        String consulta = "SELECT nombre FROM pokedex.region order by id";
        try(Connection conexion = Conexion.Conectar()){
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                regiones.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
        return regiones;
    }
}
