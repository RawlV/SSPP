package SSPP.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://baf8gl8eejgvb8fnxaks-mysql.services.clever-cloud.com:3306/baf8gl8eejgvb8fnxaks";
    private static final String USER = "uot41phminqtao4r";
    private static final String PASSWORD = "RGI6n019SKroezluAd3Z";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
