package com.teamoneboxoffice.services;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//Loads database configuration from config.properties file
//and provides a connection to the database

public class DatabaseService {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        try {
            Properties properties = new Properties();
            properties.load(DatabaseService.class.getClassLoader().getResourceAsStream("config.properties"));
            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.password");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database configuration");
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
