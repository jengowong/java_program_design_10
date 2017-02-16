package com.github.jengo.java.program.design10;

import com.sun.rowset.CachedRowSetImpl;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

public class TestRowSetEvent {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Create a row set
        RowSet rowSet = new CachedRowSetImpl();
        rowSet.addRowSetListener(new RowSetListener() {
            public void cursorMoved(RowSetEvent e) {
                System.out.println("Cursor moved");
            }

            public void rowChanged(RowSetEvent e) {
                System.out.println("Row changed");
            }

            public void rowSetChanged(RowSetEvent e) {
                System.out.println("row set changed");
            }
        });

        // Set RowSet properties
        rowSet.setUrl("jdbc:mysql://localhost/javabook");
        rowSet.setUsername("scott");
        rowSet.setPassword("tiger");
        rowSet.setCommand("select * from Student");
        rowSet.execute();

        rowSet.last(); // Cursor moved
        rowSet.updateString("lastName", "Yao"); // Update column
        rowSet.updateRow(); // Row updated

        // Close the connection
        rowSet.close();
    }
}
