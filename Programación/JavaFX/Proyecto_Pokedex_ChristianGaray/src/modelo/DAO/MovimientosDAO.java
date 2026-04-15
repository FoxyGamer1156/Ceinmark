package modelo.DAO;

import modelo.Entidades.Movimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovimientosDAO {
    public static List<Movimiento> obtenerMovimientos(String idPokemon){
        List<Movimiento> movimientos = new ArrayList<>();
        String consulta = "SELECT distinct\n" +
                "    m.id,\n" +
                "    m.nombre,\n" +
                "    t.nombre \"tipo\",\n" +
                "    c.nombre\"categoria\",\n" +
                "    m.potencia,\n" +
                "    m.precision_mov,\n" +
                "    m.pp,\n" +
                "    m.descripcion\n" +
                "FROM movimiento m\n" +
                "JOIN pokedex.pokemon_movimientos pm ON m.id = pm.movimiento_id\n" +
                "JOIN pokedex.tipo t ON m.tipo_id = t.id\n" +
                "JOIN pokedex.categoria_movimiento c ON m.categoria_id = c.id\n" +
                "WHERE pm.pokemon_id = ?\n" +
                "order by id";
        try(Connection conexion = Conexion.Conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)){
            pstmt.setString(1, idPokemon);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Movimiento movimiento = new  Movimiento();
                movimiento.setId(rs.getInt("id"));
                movimiento.setNombre(rs.getString("nombre"));
                movimiento.setTipo(rs.getString("tipo"));
                movimiento.setCategoria(rs.getString("categoria"));
                movimiento.setPotencia(rs.getDouble("potencia"));
                movimiento.setPp(rs.getInt("pp"));
                movimiento.setDescripcion(rs.getString("descripcion"));
                movimientos.add(movimiento);
            }
        } catch (SQLException e) {
            System.out.println("Ha surgido un error: " + e.getMessage());
        }
        return movimientos;
    }
}
