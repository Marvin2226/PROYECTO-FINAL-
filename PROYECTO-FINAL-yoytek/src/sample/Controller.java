package sample;


import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controller {
    @FXML
    Button comprar;

    public void salir(MouseEvent mouseEvent) {
        Platform.exit();
    }

   /* public void start(Stage stage) throws Exception {

        //Cargar el contenido del archivo /Ventana.fxml, procesarlo y crear el
        //contenido a partir del mismo.
        Parent root = FXMLLoader.load(getClass().getResource("pantalla2.fxml"));

        //Asignar las UI creadas desde *.fxml a un Scene
        Scene scene = new Scene(root);

        //Asignar el Scene a la ventana principal o Stage y mostrarla.
        stage.setScene(scene);
        stage.show();
    }*/


    public void comprar(ActionEvent actionEvent) {
        //tengo que buscar como cambiar de pantalla
        Stage stage = (Stage) comprar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla2.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("Llama al lapecillo de sistemas.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void xxx(ActionEvent actionEvent) {
        //tengo que buscar como cambiar de pantalla
        Stage stage = (Stage) comprar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla2.fxml"));
        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setContentText("Llama al lapecillo de sistemas.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
