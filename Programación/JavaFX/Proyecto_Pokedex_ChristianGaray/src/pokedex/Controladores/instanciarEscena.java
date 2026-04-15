package pokedex.Controladores;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import java.io.IOException;

public class instanciarEscena extends Application {
    /*PRIMERA INSTANCIA DE LA APLICACION*/
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/PantallaInicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicar Sesion");
        stage.setScene(scene);
        stage.show();
    }

    /*CREA UNA VENTANA*/
    public static void crearVentana(Stage stage,String ruta, String titulo) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(instanciarEscena.class.getResource(ruta));
        Parent root = fxmlLoader.load();
        stage.setScene(new Scene(root));
        stage.setTitle(titulo);
        stage.show();
    }

    /*CREA UNA VENTANA Y DUVUELVE EL CONTROLADOR PARA PODER UTILIZARLO*/
    /*T = una manera de definir un objeto de cualquier tipo, asi acepta los .java o fxml al gusto*/
    public static <T> T crearVentanaconInstancia(Stage stage,String ruta, String titulo) throws IOException {
        FXMLLoader loader = new FXMLLoader(instanciarEscena.class.getResource(ruta));
        Parent root = loader.load();
        stage.setTitle(titulo);
        stage.setScene(new Scene(root));
        stage.show();

        return loader.getController();
    }

    /*MUESTRA UNA VENTANA ERROR PASA POR EL "MENSAJE"*/
    public static void mostarError(String mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    /*MUESTRA UNA VENTANA DE INFORMACIÓN*/
    public static void mostrarInfo(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
