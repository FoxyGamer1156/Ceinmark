package modelo.DAO;

import com.mysql.cj.protocol.Resultset;
import modelo.Entidades.Habilidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HabilidadDAO {
	public List<Habilidad> obtenerHabilidades(int id){
		List<Habilidad> habilidades = new ArrayList<>();
		String consulta = "SELECT \n" +
				"    p.id,\n" +
				"    h1.nombre AS habilidad1,\n" +
				"    h2.nombre AS habilidad2\n" +
				"FROM pokemon p\n" +
				"LEFT JOIN pokemon_habilidad ph1 \n" +
				"    ON p.id = ph1.pokemon_id AND ph1.slot = 1\n" +
				"LEFT JOIN habilidad h1 \n" +
				"    ON ph1.habilidad_id = h1.id\n" +
				"LEFT JOIN pokemon_habilidad ph2 \n" +
				"    ON p.id = ph2.pokemon_id AND ph2.slot = 2\n" +
				"LEFT JOIN habilidad h2 \n" +
				"    ON ph2.habilidad_id = h2.id\n" +
				"WHERE p.id = ?";
		try(Connection conexion = Conexion.Conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)){
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){

			}
		}catch(SQLException e){
			System.out.println("Ha surgiod un erro: " + e.getMessage());
		}
		return habilidades;
	}
}
