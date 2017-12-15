package sample;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class controllerpantalla2 {
    @FXML
    ImageView compras;

    public void siguiente(MouseEvent mouseEvent) {
        Stage stage = (Stage) compras.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tercerapantalla.fxml"));
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
        tercerapantalla2 controller = fxmlLoader.<tercerapantalla2>getController();
        controller.inicial();
        controller.inicial2();
        controller.inicial3();


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    }

