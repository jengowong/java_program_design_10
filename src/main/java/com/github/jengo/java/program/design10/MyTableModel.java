package com.github.jengo.java.program.design10;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class MyTableModel extends DefaultTableModel {
    public MyTableModel() {
    }

    /** Construct a table model with specified data and columnNames */
    public MyTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    /** Override this method to return a class for the column */
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }

    /** Override this method to return true if cell is editable */
    public boolean isCellEditable(int row, int column) {
        Class columnClass = getColumnClass(column);
        return columnClass != ImageIcon.class &&
                columnClass != Date.class;
    }
}
