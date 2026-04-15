package pokedex.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modelo.Entidades.Usuario;
import javafx.scene.control.Button;

public class Home {
    private Usuario usuario;
    private Stage stage;

    @FXML
    private Button botonPokedex;
    @FXML
    private Button botonIzqGestorEntrenadores;
    @FXML
    private Button botonIzqGestorPokedex;

    @FXML
    private GridPane gridGestorPokedex;
    @FXML
    private GridPane gridGestorEntrenadores;

    @FXML
    private Label nombreUsuario;
    @FXML
    private Label bienvenida;
    @FXML
    private Label region;

    public Home(){
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*INICIALIZA LA PANTALLA PARA PODER UTILIZAR LOS ATRIBUTOS DEL CONTROLADOR*/
    public void initialize(){
    }

    /*CARGA LA ESCENA CON SUS TEXTFILE PERSONALIZADOS*/
    public void cargarEscena(){
        stage = (Stage) botonPokedex.getScene().getWindow();
        switch(usuario.getRol()){
            case "Entrenador":
                gridGestorPokedex.setVisible(false);
                botonIzqGestorPokedex.setVisible(false);
                gridGestorEntrenadores.setVisible(false);
                botonIzqGestorEntrenadores.setVisible(false);
                bienvenida.setText("Bienvenido, entrenador "+usuario.getNombreUsuario()+".");
                break;
            case "Campeon":
                bienvenida.setText("Bienvenido, campeon "+usuario.getNombreUsuario()+".");
                break;
            case "Profesor":
                bienvenida.setText("Bienvenido, profesor "+usuario.getNombreUsuario()+".");
                break;
        }
        nombreUsuario.setText(usuario.getNombreUsuario());
        region.setText("De la region de "+usuario.getRegion().substring(0,1).toUpperCase()+usuario.getRegion().substring(1)+".");
    }

    /*TE LLEVA A LA POKEDEX*/
    public void irPokedex() {
        try{
            Pokedex controlador = instanciarEscena.crearVentanaconInstancia(new Stage(), "/view/Pokedex.fxml","Pokedex");
            controlador.setUsuario(usuario);
            controlador.cargarEscena();
            Stage stage = (Stage) this.botonPokedex.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }

    /*TE LLEVA AL TEAM BUILDER*/
    public void irTeamBuilder() {
        try{
            instanciarEscena.crearVentana(new Stage(),"/view/TeamBuilder.fxml","Team Builder");
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }

    /*TE LLEVA AL GESTOR DE ENTRENADORES*/
    public void irGestorEntrenadores() {
        try{
            instanciarEscena.crearVentana(new Stage(),"/view/GestorEntrenadores.fxml","Gestor de Entrenadores");
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }

    /*TE LLEVA AL GESTOR DE POKEDEX*/
    public void irGestorPokedex() {
        try{
            instanciarEscena.crearVentana(new Stage(),"/view/GestorPokedex.fxml","Gestor de la Pokedex");
            stage.close();
        } catch (Exception e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }

    /*CIERRA ESTA PESTAÑA Y VUELVE A ABRIR EL DE INICAR SESION*/
    public void volver() {
        try{
            instanciarEscena.crearVentana(new Stage(),"/view/PantallaInicio.fxml","Iniciar Sesion");
            stage.close();
        }catch(Exception e) {
            System.out.println("Ha surgido un problema:" + e.getMessage());
        }
    }
}
