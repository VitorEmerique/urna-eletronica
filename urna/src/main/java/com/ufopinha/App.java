package com.ufopinha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import com.ufopinha.controllers.Administrador;
import com.ufopinha.utils.CreateTables;
import com.ufopinha.utils.SQLiteConnection;

/**
 * JavaFX App
 */
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

        CreateTables.createTables();

        //administrador.deleteEleitor("43");
        administrador.registrarEleitor("luca", "abfdafc", "4565", 22, 33);
        //administrador.registrarEleitor("luc", "123", "456", 22, 33);
        System.out.println("Hello!");
        // launch();
    }

}