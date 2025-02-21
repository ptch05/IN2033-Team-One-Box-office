package com.teamoneboxoffice.services;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//Loads database configuration from config.properties file
//and provides a connection to the database

public class DatabaseService {
    private static String URL;

    // Map of username to password
    private static Map<String, String> userCredentials = new HashMap<>();

    static {
        try {
            // Load database configuration from config.properties
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
            URL = properties.getProperty("db.url");

            // Load multiple users into the map
            userCredentials.put(properties.getProperty("db.user1.username"), properties.getProperty("db.user1.password"));
            userCredentials.put(properties.getProperty("db.user2.username"), properties.getProperty("db.user2.password"));
            userCredentials.put(properties.getProperty("db.user3.username"), properties.getProperty("db.user3.password"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database configuration");
        }
    }

    // Returns a connection to the database if the username and password are valid
    public static Connection getConnection(String username, String password) throws SQLException {
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            return DriverManager.getConnection(URL, username, password);
        } else {
            throw new SQLException("Invalid username or password");
        }
    }

    // Returns the password for a given username
    public static String getPasswordForUser(String username) {
        return userCredentials.get(username);
    }
}
