package com.teamoneboxoffice.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private ImageView logoImage;

    @FXML
    private Label usernameLabel, passwordLabel;

    // Method that runs when FXML is loaded
    @FXML
    public void initialize() {
        System.out.println("Login screen loaded successfully!");
    }

}
