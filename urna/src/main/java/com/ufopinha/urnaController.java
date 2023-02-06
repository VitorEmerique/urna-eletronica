package com.ufopinha;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.ufopinha.controllers.Urna;
import com.ufopinha.models.Eleitor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class urnaController implements Initializable {
    @FXML
    TextField numeroField;
    @FXML
    Button btnove;
    @FXML
    Button btnoito;
    @FXML
    Button btnsete;
    @FXML
    Button btnseis;
    @FXML
    Button btncinco;
    @FXML
    Button btnquatro;
    @FXML
    Button btntres;
    @FXML
    Button btndois;
    @FXML
    Button btnum;
    @FXML
    Button btnzero;
    @FXML
    Button btnconfirma;
    @FXML
    Button btncorrige;
    @FXML
    Button btnsair;

    Eleitor eleitor;

    @FXML
    private void confirmaVoto() {

        String numero = numeroField.getText();
        int num = Integer.parseInt(numero);
        String titulo = PrimaryController.t;
        Urna urna = new Urna();
        urna.registrarVoto(titulo, num);
        System.out.println(PrimaryController.t);

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("mesario");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnzero.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "0");

            }

        });

        btnum.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "1");

            }

        });

        btndois.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "2");

            }

        });

        btntres.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "3");

            }

        });

        btnquatro.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "4");

            }

        });

        btncinco.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "5");

            }

        });

        btnseis.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "6");

            }

        });

        btnsete.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "7");

            }

        });

        btnoito.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "8");

            }

        });

        btnove.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText(numeroField.getText() + "9");

            }

        });

        btncorrige.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                numeroField.setText("");

            }

        });

    }
}