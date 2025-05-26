package com.example.proyectfinal.Controller;

import com.example.proyectfinal.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;

/**
 * Controlador para la vista de login sin conexión a base de datos.
 * Valida usuario y contraseña usando valores predefinidos.
 *
 * @author Tú
 */
public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    private void onLogin(ActionEvent event) {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        // Simulación de autenticación (haz tu lógica real aquí)
        if ("admin".equals(user) && "1234".equals(pass)) {
            SceneManager.getInstance().switchScene("dashboard.fxml", "Panel Principal");
        } else {
            errorLabel.setText("Usuario o contraseña incorrectos");
        }
    }
}
