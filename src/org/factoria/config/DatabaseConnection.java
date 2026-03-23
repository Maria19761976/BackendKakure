package org.factoria.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL      = "jdbc:mysql://localhost:3306/kakureanime";
    private static final String USER     = "root";
    private static final String PASSWORD = "root" ;
    private static Connection connection = null;

    private DatabaseConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Database connection established.");
            } catch (ClassNotFoundException e) {
                System.err.println("❌ MySQL Driver not found: " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("❌ Error connecting to the database: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("🔒 Connection closed.");
            } catch (SQLException e) {
                System.err.println("❌ Error closing the connection: " + e.getMessage());
            }
        }
    }
}