package org.factoria.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/kakureanime";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager
                    .getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa :)");
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) connection.close();
            System.out.println("Conexión cerrada :)");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}