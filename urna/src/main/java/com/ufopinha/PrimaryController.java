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
    public static String t;

    @FXML
    private Button resgistrar;

    @FXML
    public String nome() {

        return t;

    }

    @FXML
    private void switchToRegister() throws IOException {
        App.setRoot("register");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("urna");
    }

    @FXML
    private void autenticaEleitor() throws IOException {
        try {

            String cpf1 = cpf.getText();
            String titulo1 = titulo.getText();
            t = titulo1;
            Mesario m = new Mesario();

            Eleitor e = m.autenticaEleitor(titulo1);
            if (e != null) {
                switchToSecondary();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
