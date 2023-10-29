package com.springcore.corejdbc;

import com.springcore.corejdbc.connectionprovider.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperationHandlerTest {
    public static void main(String[] args) {
        Connection connection = ConnectionManager.getConnection();
        System.out.println(connection);

        Connection connection1 = ConnectionManager.getConnection();
        System.out.println(connection1);

        try {
            DatabaseOperationHandler.updatingStudentInfoTable(new ArrayList<>(List.of(new String[]{"Sonu", "10th"})));
        } catch (Exception exception) {

        }

        ResultSet resultSet = DatabaseOperationHandler.getAllStudentsInfo();

        try {
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("StudentID") + "  ");
                System.out.print(resultSet.getString("StudentName") + "  ");
                System.out.println(resultSet.getString("StudentStandard"));
            }
        } catch (Exception exception) {
            exception.getStackTrace();
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
}
