package com.github.jengo.java.program.design10;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import java.awt.Image;

public class MyImageCellRenderer extends DefaultTableCellRenderer {
    /** Override this method in DefaultTableCellRenderer */
    public Component getTableCellRendererComponent
    (JTable table, Object value, boolean isSelected,
     boolean isFocused, int row, int column) {
        Image image = ((ImageIcon) value).getImage();
        ImageViewer imageViewer = new ImageViewer(image);

        return imageViewer;
    }
}
