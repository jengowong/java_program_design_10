package com.github.jengo.java.program.design10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindUserTables {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Establish a connection
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/javabook", "scott", "tiger");
        System.out.println("Database connected");

        DatabaseMetaData dbMetaData = connection.getMetaData();

        ResultSet rsTables = dbMetaData.getTables(null, null, null,
                new String[]{"TABLE"});
        System.out.print("User tables: ");
        while (rsTables.next())
            System.out.print(rsTables.getString("TABLE_NAME") + " ");

        // Close the connection
        connection.close();
    }
}
