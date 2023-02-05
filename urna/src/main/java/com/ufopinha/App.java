package com.ufopinha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


import com.ufopinha.controllers.Administrador;
import com.ufopinha.controllers.Mesario;
import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.models.Eleitor;
import com.ufopinha.utils.CreateTables;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Administrador administrador = new Administrador();
        Mesario mesario = new Mesario();

        CreateTables.createTables();

        // administrador.registrarEleitor("luca", "abfdafc", "4565", 22, 33);
        
        administrador.registrarPartido("partidao do mingao", 22);
        administrador.registrarPartido("pt partido da", 13);

        // administrador.registrarCandidato("luc", "123", "456", 22, 33);

        administrador.registrarCargo("Presidente da República");
        administrador.registrarCargo("Governador");
        administrador.registrarCargo("Senador");
        administrador.registrarCargo("Deputado Federal");
        administrador.registrarCargo("Deputado Estadual");

        administrador.registrarEleitor("rei", "575", "987", 88, 99);
        administrador.registrarEleitor("vit", "358", "243", 88, 99);

        administrador.registrarCandidato("biroliro", "taok", "hghgh", 88, 99, 22, 1, 22);
        administrador.registrarCandidato("lula mosluc", "picanha", "pinga", 88, 99, 13, 1, 13);

        administrador.registraEleicao("eleicao top 2032");

        administrador.registrarVoto("987", 13);
        administrador.registrarVoto("243", 22);

        mesario.autenticaEleitor("243");

        launch();
    }

}