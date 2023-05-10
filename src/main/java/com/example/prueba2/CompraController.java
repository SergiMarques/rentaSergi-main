package com.example.prueba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CompraController {

    private MenuController controllermenu;
    private Stage stage;
    @FXML
    private Label txtCorreo;


    @FXML
    void Volver(ActionEvent event) {
        controllermenu.show();
        stage.close();
    }


    public void init(String text, Stage stage, MenuController menuController) {
        txtCorreo.setText(text);
        this.controllermenu = menuController;
        this.stage = stage;
    }
}
