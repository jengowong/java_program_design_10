package com.github.jengo.java.program.design10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResultSetMetaData {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Establish a connection
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/javabook", "scott", "tiger");
        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a statement
        ResultSet resultSet = statement.executeQuery
                ("select * from Enrollment");

        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
            System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
        System.out.println();

        // Iterate through the result and print the student names
        while (resultSet.next()) {
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                System.out.printf("%-12s\t", resultSet.getObject(i));
            System.out.println();
        }

        // Close the connection
        connection.close();
    }
}
