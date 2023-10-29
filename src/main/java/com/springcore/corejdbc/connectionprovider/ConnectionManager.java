package com.springcore.corejdbc.connectionprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class ConnectionManager {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeInfo", "root", "root");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (connection != null) {
                try {
                    if (connection.isClosed()) {
                        System.out.println("Connection Object created but connection is Closed !!");
                    } else {
                        System.out.println("Connection Object Created and Connection Made Successfully !!");
                    }
                } catch (SQLException e) {
                    System.out.println(Arrays.toString(e.getStackTrace()));
                }

            } else {
                System.out.println("Connection Object Not Created");
            }
        }
        return connection;
    }
}
