package com.github.jengo.java.program.design10;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class TreeCellRendererEditorDemo extends JApplet {
    ImageIcon yourCustomLeafImageIcon =
            new ImageIcon(getClass().getResource("/image/caIcon.gif"));
    ImageIcon yourCustomOpenImageIcon =
            new ImageIcon(getClass().getResource("/image/flag16.gif"));
    ImageIcon yourCustomClosedImageIcon =
            new ImageIcon(getClass().getResource("/image/rbs.gif"));

    public TreeCellRendererEditorDemo() {
        JTree jTree1 = new JTree();
        getContentPane().add(new JScrollPane(jTree1),
                BorderLayout.CENTER);

        DefaultTreeCellRenderer renderer =
                (DefaultTreeCellRenderer) jTree1.getCellRenderer();
        renderer.setLeafIcon(yourCustomLeafImageIcon);
        renderer.setOpenIcon(yourCustomOpenImageIcon);
        renderer.setClosedIcon(yourCustomClosedImageIcon);
        renderer.setBackgroundSelectionColor(Color.red);

        // Customize editor
        JComboBox jcboColor = new JComboBox();
        jcboColor.addItem("red");
        jcboColor.addItem("green");
        jcboColor.addItem("blue");
        jcboColor.addItem("yellow");
        jcboColor.addItem("orange");

        jTree1.setCellEditor(new DefaultCellEditor(jcboColor));
        jTree1.setEditable(true);

        jTree1.setCellEditor
                (new DefaultTreeCellEditor(jTree1,
                        new DefaultTreeCellRenderer(),
                        new DefaultCellEditor(jcboColor)));

    }

    public static void main(String[] args) {
        TreeCellRendererEditorDemo applet = new TreeCellRendererEditorDemo();
        JFrame frame = new JFrame();
        //EXIT_ON_CLOSE == 3
        frame.setDefaultCloseOperation(3);
        frame.setTitle("TreeCellRendererEditorDemo");
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.setSize(400, 320);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((d.width - frame.getSize().width) / 2,
                (d.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

    //static initializer for setting look & feel
    static {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
        }
    }
}
