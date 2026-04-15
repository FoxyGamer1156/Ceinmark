package pokedex.Controladores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import modelo.DAO.regionDAO;
import modelo.DAO.usuarioDAO;

public class CrearCuenta {
    @FXML
    private Button btcrearCuenta;
    @FXML
    private Button btVolver;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField nombreUsuario;
    @FXML
    private PasswordField pfContrasena;
    @FXML
    private PasswordField pfConfirmarContra;
    @FXML
    private TextField tfContrasena;
    @FXML
    private TextField tfConfirmarContra;
    @FXML
    private ChoiceBox<String>   choBoxRol;
    @FXML
    private ChoiceBox<String>   choBoxRegion;


    public void initialize(){
        this.choBoxRol.getItems().addAll("Entrenador","Campeon","Profesor");
        this.choBoxRol.setValue("Entrenador");
        regionDAO.regiones().stream().forEach(region -> {
            this.choBoxRegion.getItems().add(region.substring(0,1).toUpperCase() + region.substring(1));
        });
        this.choBoxRegion.setValue("Kanto");
    }

    /*COMPRUEBA QUE TODOS LOS CAMPOS ESTEN RELLENADOS*/
    private boolean comprobarCampos(){
        if(this.tfNombre.getText().isEmpty()){
            instanciarEscena.mostarError("El \"Nombre\" esta vacio");
            this.tfNombre.requestFocus();
            return false;
        }
        if(this.tfApellidos.getText().isEmpty()){
            instanciarEscena.mostarError("El \"Apellidos\" esta vacio");
            this.tfApellidos.requestFocus();
            return false;
        }
        if(this.nombreUsuario.getText().isEmpty()){
            instanciarEscena.mostarError("El \"Nombre de usuario\" esta vacio");
            this.tfApellidos.requestFocus();
            return false;
        }
        if(this.pfContrasena.getText().isEmpty()){
            instanciarEscena.mostarError("La \"Contraseña\" esta vacio");
            this.pfContrasena.requestFocus();
            return false;
        }
        if(this.pfConfirmarContra.getText().isEmpty()){
            instanciarEscena.mostarError("El campo \"Confirmar contraseña\" esta vacio");
            this.pfConfirmarContra.requestFocus();
            return false;
        }
        return true;
    }

    /*ESTA ACCION CAMBIA EL PASSWOR FIELD POR UN TEXT FIELD PARA PODER VER LA CONTRASEÑA*/
    public void MostrarOcultarContra(ActionEvent actionEvent) {
        if(this.pfContrasena.isVisible()){
            this.tfContrasena.setText(this.pfContrasena.getText());
            this.tfConfirmarContra.setText(this.pfConfirmarContra.getText());
            this.pfConfirmarContra.setVisible(false);
            this.tfConfirmarContra.setVisible(true);
            this.pfContrasena.setVisible(false);
            this.tfContrasena.setVisible(true);
        }else {
            this.pfContrasena.setText(this.tfContrasena.getText());
            this.pfConfirmarContra.setText(this.tfConfirmarContra.getText());
            this.tfConfirmarContra.setVisible(false);
            this.pfConfirmarContra.setVisible(true);
            this.tfContrasena.setVisible(false);
            this.pfContrasena.setVisible(true);
        }
    }

    /*LLAMA A USUARIODAO PARA HACER EL INSERT EN LA BASE DE DATOS*/
    public void btCrearCuenta(ActionEvent actionEvent) {
        int region = this.choBoxRegion.getSelectionModel().getSelectedIndex()+1;
        int tipo_pokedex = 1;
        String rol = choBoxRol.getValue();
        if(!comprobarCampos())
            return;
        if(rol.equals("Entrenador")){
            tipo_pokedex = region+1;
        }
        if(!usuarioDAO.usuarioExiste(this.nombreUsuario.getText())){
            if(usuarioDAO.crearUsuario(this.nombreUsuario.getText(),this.tfNombre.getText(),this.tfApellidos.getText(),this.pfContrasena.getText(),this.pfConfirmarContra.getText(),this.choBoxRol.getValue(),region,tipo_pokedex)){
                instanciarEscena.mostrarInfo("Usuario registrado con exito");
                Stage stage = (Stage) this.btcrearCuenta.getScene().getWindow();
                stage.close();
            }
        }else{
            instanciarEscena.mostarError("El nombre de usuario ya existe");
            this.nombreUsuario.requestFocus();
        }
    }

    /*INSTANCIA CIERRA LA VENTANA DE CREAR CUENTA*/
    public void Volver(ActionEvent actionEvent) {
        Stage stage = (Stage) this.btcrearCuenta.getScene().getWindow();
        stage.close();
    }
}
