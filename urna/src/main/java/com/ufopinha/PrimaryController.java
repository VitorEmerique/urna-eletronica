package com.ufopinha;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import com.ufopinha.controllers.Mesario;
import com.ufopinha.models.Eleitor;

public class PrimaryController {
    @FXML
    private TextField cpf;
    @FXML
    private TextField titulo;
    @FXML
    private Button login;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void autenticaEleitor() throws IOException {
        try {
            String cpf1 = cpf.getText();
            String titulo1 = titulo.getText();
            Mesario m = new Mesario();
            Eleitor e = m.autenticaEleitor(titulo1);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
