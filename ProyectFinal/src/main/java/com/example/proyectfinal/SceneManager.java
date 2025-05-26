package com.example.proyectfinal;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Singleton para gestionar el cambio de escenas.
 */
public class SceneManager {

    private static final SceneManager instance = new SceneManager();
    private Stage primaryStage;

    private SceneManager() {}

    public static SceneManager getInstance() {
        return instance;
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    /**
     * Cambia la escena cargando el FXML dado.
     * @param fxml Archivo FXML a cargar (debe estar en el mismo paquete que Main.class).
     * @param title Título de la ventana.
     */
    public void switchScene(String fxml, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxml));
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle(title);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
