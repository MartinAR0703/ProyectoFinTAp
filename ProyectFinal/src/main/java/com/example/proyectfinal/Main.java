package com.example.proyectfinal;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Inicializa el SceneManager con el stage principal
        SceneManager.getInstance().setPrimaryStage(primaryStage);
        SceneManager.getInstance().switchScene("login.fxml", "Login - Fútbol Scraper");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

