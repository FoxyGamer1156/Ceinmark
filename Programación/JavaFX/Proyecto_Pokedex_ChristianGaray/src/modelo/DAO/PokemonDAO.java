package modelo.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Entidades.Pokemon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAO {
    public static ObservableList<Pokemon> listaPokemon(){
        ObservableList<Pokemon> listaPokemon = FXCollections.observableArrayList();
        String consulta = "SELECT \n" +
                "    p.id,\n" +
                "    p.nombre,\n" +
                "    p.altura,\n" +
                "    p.peso,\n" +
                "    t1.nombre AS tipo1,\n" +
                "    t2.nombre AS tipo2,\n" +
                "    p.descripcion,\n" +
                "    p.sprite_modelo,\n" +
                "    p.baseHp,\n" +
                "    p.baseAtq,\n" +
                "    p.baseDef,\n" +
                "    p.baseAtqEsp,\n" +
                "    p.baseDefEsp,\n" +
                "    p.basevel,\n" +
                "    p.ratioCaptura,\n" +
                "    r.id AS region_origen\n" +
                "FROM pokedex.pokemon p\n" +
                "LEFT JOIN pokemon_tipo pt1 ON p.id = pt1.pokemon_id AND pt1.tipo_id = 1\n" +
                "LEFT JOIN tipo t1 ON pt1.tipo_id = t1.id\n" +
                "LEFT JOIN pokemon_tipo pt2 ON p.id = pt2.pokemon_id AND pt2.tipo_id = 2\n" +
                "LEFT JOIN tipo t2 ON pt2.tipo_id = t2.id\n" +
                "LEFT JOIN region r ON p.region_origen_id = r.id\n" +
                "order by p.id";
        try(Connection conexion = Conexion.Conectar();){
            Statement stmtPokemon = conexion.createStatement();
            ResultSet rsPokemon = stmtPokemon.executeQuery(consulta);
            while(rsPokemon.next()){
                Pokemon pokemon = new Pokemon();
                pokemon.setId(rsPokemon.getInt("id"));
                pokemon.setNombre(rsPokemon.getString("nombre").substring(0,1).toUpperCase() + rsPokemon.getString("nombre").substring(1));
                pokemon.setAltura(rsPokemon.getDouble("altura"));
                pokemon.setPeso(rsPokemon.getDouble("peso"));
                pokemon.setTipo1(rsPokemon.getString("tipo1"));
                pokemon.setTipo2(rsPokemon.getString("tipo2"));
                pokemon.setDescripcion(rsPokemon.getString("descripcion"));
                pokemon.setSpriteModelo(rsPokemon.getString("sprite_modelo"));
                pokemon.setBaseHp(rsPokemon.getInt("baseHp"));
                pokemon.setBaseAtq(rsPokemon.getInt("baseAtq"));
                pokemon.setBaseDef(rsPokemon.getInt("baseDef"));
                pokemon.setBaseAtqEsp(rsPokemon.getInt("baseAtqEsp"));
                pokemon.setBaseDefEsp(rsPokemon.getInt("baseDefEsp"));
                pokemon.setBaseVel(rsPokemon.getInt("baseVel"));
                pokemon.setRatioCaptura(rsPokemon.getInt("ratioCaptura"));
                pokemon.setRegionOrigen(rsPokemon.getInt("region_origen"));
                pokemon.setMovimientos(MovimientosDAO.obtenerMovimientos("id"));
                listaPokemon.add(pokemon);
            }
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
        return listaPokemon;
    }
}
