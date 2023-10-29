package com.springcore.corejdbc;

import com.springcore.corejdbc.connectionprovider.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseOperationHandler {

    public static void creatingTable() {
        Connection connection = null;
        try {
            String query = "CREATE TABLE products ( product_id int(11) NOT NULL AUTO_INCREMENT, product_name varchar(150) NOT NULL, PRIMARY KEY (`product_id`));";
            connection = ConnectionManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Created Successfully");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static void updatingStudentInfoTable(ArrayList<String> studentInfo) {
        Connection connection = null;
        try {
            String query = "insert into student_info(StudentName, StudentStandard) values(?, ?);";
            connection = ConnectionManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String studentName = studentInfo.get(0);
            String studentStandard = studentInfo.get(1);
            preparedStatement.setString(1, studentName);
            preparedStatement.setString(2, studentStandard);
            preparedStatement.executeUpdate();
            System.out.println("Successfully StudentInfo Table Updated!!");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static ResultSet getAllStudentsInfo() {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM student_Info;";
            connection = ConnectionManager.getConnection();
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            System.out.println("Successfully Data Fetched !!");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return resultSet;
    }
}
