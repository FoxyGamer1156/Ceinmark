package pokedex.Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;

import javafx.stage.Stage;
import modelo.DAO.usuarioDAO;
import modelo.Entidades.Usuario;

public class IniciarSesion{
    @FXML
    private Button iniciarSesion;
    @FXML
    private TextField IntroUsur;
    @FXML
    private TextField introContrasena;

    /*COMPRUEBA TODOS LOS CAMPOS SI ESTAN RELLENADOS*/
    private boolean comprobarCampos(){
        if(this.IntroUsur.getText().isEmpty()){
            instanciarEscena.mostarError("El \"Nombre de Usuario\" esta vacio");
            this.IntroUsur.requestFocus();
            return false;
        }
        if(this.introContrasena.getText().isEmpty()){
            instanciarEscena.mostarError("La \"contraseña\" esta vacia");
            this.introContrasena.requestFocus();
            return false;
        }
        return true;
    }

    /*LLAMA AL usuarioDAO para comprobar que todos los campos son correctos en la base de datos, es decir comprueba que exista el usuario y que la contraseña coincida con al guardada*/
    public void inicarSesion() {
        String usur = this.IntroUsur.getText();
        String contrasena = this.introContrasena.getText();
        if(!comprobarCampos())
            return;
        if(!usuarioDAO.comprobarContrasena(usur, contrasena)){
            instanciarEscena.mostarError("Las contrasenas no coinciden");
            this.introContrasena.requestFocus();
            return;
        }
        Usuario usuario= usuarioDAO.obtenerUsuario(usur);
        try{
            Home controlador = instanciarEscena.crearVentanaconInstancia(new Stage(), "/view/Home.fxml","Home");
            controlador.setUsuario(usuario);
            controlador.cargarEscena();
            Stage stage = (Stage) this.iniciarSesion.getScene().getWindow();
            stage.close();
        }catch (Exception e){
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }

    /*HABRE LA PESTAÑA DE CREAR CUENTA*/
    public void crearCuenta() {
        try{
            instanciarEscena.crearVentana(new Stage(),"/view/CrearCuenta.fxml","Crear Cuenta");
        } catch (IOException e) {
            System.out.println("Ha surgido un problema:"+e.getMessage());
        }
    }
}