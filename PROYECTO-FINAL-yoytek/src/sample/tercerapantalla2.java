package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class tercerapantalla2 {
    @FXML
    ComboBox<String> opcion;
    @FXML
    ComboBox<String> opcion2;
    @FXML
    ComboBox<String> opcion3;
    @FXML
    TextArea descripcion;
    @FXML
    TextArea descripcion2;

    @FXML
    TextArea descripcion3;

    public void inicial() {
        ObservableList<String> Data = FXCollections.observableArrayList();
        Data.add("4 GB");
        Data.add("8 GB");
        Data.add("16 GB");
        Data.add("32 GB");
        opcion.setItems(Data);
    }

    public void mostrar(ActionEvent ActionEvent) {
        if (opcion.getSelectionModel().getSelectedItem().toString().equals("4 GB")) {
            descripcion.setText("El Costo es de $43.90 ");
        } else if (opcion.getSelectionModel().getSelectedItem().toString().equals("8 GB")) {
            descripcion.setText("El Costo es de $59.90 ");
        } else if (opcion.getSelectionModel().getSelectedItem().toString().equals("16 GB")) {
            descripcion.setText("El Costo es de $89.90");
        } else if (opcion.getSelectionModel().getSelectedItem().toString().equals("32 GB")) {
            descripcion.setText("El Costo es de $99.95");
        }
    }

    public void inicial2() {
        ObservableList<String> Data = FXCollections.observableArrayList();
        Data.add("Intel Core i3 - 7100");
        Data.add("Intel Core i - 6400");
        Data.add("Intel Core i7 - 6700");
        Data.add("Intel Core i7 - 7700k");
        opcion2.setItems(Data);
    }

    public void mostrar2(ActionEvent ActionEvent) {
        if (opcion2.getSelectionModel().getSelectedItem().toString().equals("Intel Core i3 - 7100")) {
            descripcion2.setText("El Costo es de $119.90 ");
        } else if (opcion2.getSelectionModel().getSelectedItem().toString().equals("Intel Core i - 6400")) {
            descripcion2.setText("El Costo es de $192.90 ");
        } else if (opcion2.getSelectionModel().getSelectedItem().toString().equals("Intel Core i7 - 6700")) {
            descripcion2.setText("El Costo es de $329.90");
        } else if (opcion2.getSelectionModel().getSelectedItem().toString().equals("Intel Core i7 - 7700k")) {
            descripcion2.setText("El Costo es de $386.95");
        }

    }
    public void inicial3() {
        ObservableList<String> Data = FXCollections.observableArrayList();
        Data.add("500 GB");
        Data.add("1 TB");
        Data.add("2 TB");
        Data.add("4 TB");
        opcion3.setItems(Data);
    }

    public void mostrar3(ActionEvent ActionEvent) {
        if (opcion3.getSelectionModel().getSelectedItem().toString().equals("500 GB")) {
            descripcion3.setText("El Costo es de $45.90 ");
        } else if (opcion3.getSelectionModel().getSelectedItem().toString().equals("1 TB")) {
            descripcion3.setText("El Costo es de $72.90 ");
        } else if (opcion3.getSelectionModel().getSelectedItem().toString().equals("2 TB")) {
            descripcion3.setText("El Costo es de $95.90");
        } else if (opcion3.getSelectionModel().getSelectedItem().toString().equals("4 TB")) {
            descripcion3.setText("El Costo es de $127.95");
        }
    }
}