package com.teamoneboxoffice.controllers;

import com.teamoneboxoffice.services.DatabaseService;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Controller for the login screen
// This class is responsible for handling user input and authenticating users
// against the database
public class LoginController {

    // Inject the username and password fields from the FXML file
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Handle the login button click event
    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authenticate(username, password)) {
            System.out.println("Login successful for user: " + username);
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }

    // The method queries the database to check if the username and password are valid
    // Returns true if the username and password are valid, false otherwise
    // This method should be called when the user clicks the login button
    // or presses Enter in the password field
    
    private boolean authenticate(String username, String password) {
        String query = "SELECT password FROM Staff WHERE name = ?";

        try (Connection conn = DatabaseService.getConnection(username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                return storedPassword != null && storedPassword.equals(password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    @FXML
    public void initialize() {
        // Listens for Enter key press in the password field
        passwordField.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                handleLogin();
            }
        });

        // Also listens for Enter in usernameField
        usernameField.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                passwordField.requestFocus(); // Move focus to password field
            }
        });
    }
}
