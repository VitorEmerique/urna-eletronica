package com.ufopinha;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.ufopinha.controllers.Administrador;
import com.ufopinha.controllers.Urna;
import com.ufopinha.models.Eleitor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistroController implements Initializable {
    @FXML
    TextField nome;
    @FXML
    TextField cpf;
    @FXML
    TextField titulo;
    @FXML
    TextField zona;
    @FXML
    TextField secao;
    @FXML
    Button confirmar;
    @FXML
    Button voltar;

    Eleitor eleitor;

    @FXML
    private void insereEleitor() throws NumberFormatException, IOException {

        String nomee = nome.getText();
        String cpff = cpf.getText();
        String tituloo = titulo.getText();
        int secaoo = Integer.parseInt(secao.getText());
        int zonaa = Integer.parseInt(zona.getText());
        Administrador adm = new Administrador();
        adm.registrarEleitor(nomee, cpff, tituloo, zonaa, secaoo);
        switchToPrimary();

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("mesario");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

}