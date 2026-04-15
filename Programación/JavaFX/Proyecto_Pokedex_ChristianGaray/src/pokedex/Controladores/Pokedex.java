package pokedex.Controladores;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.DAO.PokemonDAO;
import modelo.Entidades.Pokemon;
import modelo.Entidades.Usuario;

import java.util.ArrayList;


public class Pokedex {
    @FXML
    private Button botonHome;
    @FXML
    private Button botonPokedex;
    @FXML
    private Button botonTeamBuilder;
    @FXML
    private Button botonGestorEntrenador;
    @FXML
    private Button botonGestorPokedex;
    @FXML
    private Button botonCerrarSesion;

    @FXML
    private Label nombreUsuario;
    @FXML
    private Label pokemonAltura;
    @FXML
    private Label pokemonPeso;
    @FXML
    private Label numPokemonImg;
    @FXML
    private Label nombrePokemonImg;

    @FXML
    private TextField filtroIdPokemon;
    @FXML
    private TextField filtroNombrePokemon;

    @FXML
    private TableView<Pokemon> tablaPokemons;
    @FXML
    private TableColumn<Pokemon, Integer> colId;
    @FXML
    private TableColumn<Pokemon, String> colNombre;
    @FXML
    private TableColumn<Pokemon, String> colSprite;
    @FXML
    private TableColumn<Pokemon, String> colTipo1;
    @FXML
    private TableColumn<Pokemon, String> colTipo2;

    @FXML
    private ImageView spritePokemon;

    private ObservableList<Pokemon> listaPokemons;
    private Pokemon pokemon;
    private Usuario usuario;
    private Stage stage;

    public Pokedex(){}
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void initialize(){
    }

    public void cargarEscena(){
        listaPokemons = PokemonDAO.listaPokemon();

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colSprite.setCellValueFactory(new PropertyValueFactory<>("spriteModelo"));
        colTipo1.setCellValueFactory(new PropertyValueFactory<>("tipo1"));
        colTipo2.setCellValueFactory(new PropertyValueFactory<>("tipo2"));
        tablaPokemons.setItems(listaPokemons);

        colSprite.setCellFactory(col -> new TableCell<Pokemon, String>() {
            private final ImageView imageView = new ImageView();

            @Override
            protected void updateItem(String url, boolean empty) {
                super.updateItem(url, empty);

                if (empty || url == null) {
                    setGraphic(null);
                    return;
                }

                imageView.setFitWidth(48);
                imageView.setFitHeight(48);
                imageView.setPreserveRatio(true);

                imageView.setImage(new Image(url, true));
                setGraphic(imageView);
            }
        });


        /*CREO UN LISTENER PARA QUE CUANDO SELECCIONE UN POKEMON SE MUESTRE EN EL IMAGEN VIEW*/
        tablaPokemons.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            if (newV != null) {
                pokemon = newV;
                mostrarPokemonSeleccionado();
            }
        });


        /*Mostrando el primer pokemons*/
        tablaPokemons.getSelectionModel().selectFirst();
        pokemon = tablaPokemons.getSelectionModel().getSelectedItem();
        mostrarPokemonSeleccionado();

        nombreUsuario.setText(usuario.getNombreUsuario());
        numPokemonImg.setText("Id: "+pokemon.getId());
        nombrePokemonImg.setText("Nombre: "+pokemon.getNombre());
        stage = (Stage) this.botonPokedex.getScene().getWindow();
    }

    private void mostrarPokemonSeleccionado(){
        if(pokemon == null){
            spritePokemon.setImage(null);
            return;
        }
        try{
            Image sprite = new Image(pokemon.getSpriteModelo());
            spritePokemon.setImage(sprite);
            pokemonAltura.setText(String.valueOf(pokemon.getAltura()));
            pokemonPeso.setText(String.valueOf(pokemon.getPeso()));
        } catch (Exception e) {
            System.out.println("Ha surgido un error: "+e.getMessage());
            spritePokemon.setImage(null);
        }
    }


    public void volverHome() {
        try{
            Home controlador = instanciarEscena.crearVentanaconInstancia(new Stage(), "/view/Home.fxml","Home");
            controlador.setUsuario(usuario);
            controlador.cargarEscena();
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un error: "+e.getMessage());
        }
    }

    public void irGestorEntrenador(ActionEvent actionEvent) {

    }

    public void irTeamBuilder(ActionEvent actionEvent) {

    }

    public void irGestorPokedex(ActionEvent actionEvent) {

    }

    public void cerrarSesion(ActionEvent actionEvent) {

    }

    public void abrirPokemon(ActionEvent actionEvent) {
        try{
            PantallaPokemon controlador = instanciarEscena.crearVentanaconInstancia(new Stage(), "/view/Pokemon.fxml","Pokemon");
            controlador.setPokemon(pokemon);
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un error: "+e.getMessage());
        }

    }
}
