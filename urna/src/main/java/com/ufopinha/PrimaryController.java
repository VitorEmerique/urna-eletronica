package com.ufopinha;

import java.io.IOException;
import javafx.fxml.FXML;

import com.ufopinha.controllers.Mesario;
import com.ufopinha.models.Eleitor;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void autenticaEleitor() throws IOException {
        Mesario m = new Mesario();
        Eleitor e = m.autenticaEleitor("243");
        System.out.println(e.getNome());
    }

}
