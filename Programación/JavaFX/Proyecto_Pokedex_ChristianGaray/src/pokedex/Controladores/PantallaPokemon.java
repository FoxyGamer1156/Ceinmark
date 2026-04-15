package pokedex.Controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Entidades.Pokemon;

public class PantallaPokemon {
	@FXML
	private ImageView spritePokemon;

	@FXML
	private Label pokeNum;
	@FXML
	private Label pokeNombre;
	@FXML
	private Label descripcion;
	@FXML
	private Label pokeTipo1;
	@FXML
	private Label pokeTipo2;
	@FXML
	private Label habilidad1;
	@FXML
	private Label habilidad2;
	@FXML
	private Label habilidadOculta;
	@FXML
	private Label pokemonAltura;
	@FXML
	private Label pokemonPeso;
	@FXML
	private Label numHp;
	@FXML
	private Label numAtq;
	@FXML
	private Label numDef;
	@FXML
	private Label numAtqEsp;
	@FXML
	private Label numDefEsp;
	@FXML
	private Label numVel;

	@FXML
	private ProgressBar barHp;
	@FXML
	private ProgressBar barAtq;
	@FXML
	private ProgressBar barDef;
	@FXML
	private ProgressBar barAtqEsp;
	@FXML
	private ProgressBar barDefEsp;
	@FXML
	private ProgressBar barVel;

	private Pokemon pokemon;
	public PantallaPokemon(){}
	public void setPokemon(Pokemon pokemon) {this.pokemon = pokemon;}
	public Pokemon getPokemon() {return this.pokemon;}
	public void initialize(){
	}

	public void cargarEscena(){
		pokeNum.setText(Integer.toString(pokemon.getId()));
		pokeNombre.setText(pokemon.getNombre());
		descripcion.setText(pokemon.getDescripcion());
		pokeTipo1.setText(pokemon.getTipo1());
		pokeTipo2.setText(pokemon.getTipo2());
		mostrarPokemon();
	}
	private void mostrarPokemon(){
		if(pokemon == null){
			spritePokemon.setImage(null);
			return;
		}
		try{
			Image sprite = new Image(pokemon.getSpriteModelo());
			spritePokemon.setImage(sprite);
		} catch (Exception e) {
			System.out.println("Ha surgido un error: "+e.getMessage());
			spritePokemon.setImage(null);
		}
	}


}
