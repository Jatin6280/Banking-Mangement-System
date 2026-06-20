 package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/bank_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Jatin6280492168";

    public static Connection   getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database Connected Successfully!");

            return conn;
        } catch (Exception e) {
            System.out.println("❌ Connection Failed: " + e.getMessage());
            return null;
        }
    }
}
