package com.github.jengo.java.program.design10;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;

public class JSplitPaneDemo extends JApplet {
    public JSplitPaneDemo() {

        JSplitPane jSplitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JButton("Top Component"), new JButton("Bottom Component"));

        add(jSplitPane2, BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        JSplitPaneDemo applet = new JSplitPaneDemo();
        JFrame frame = new JFrame();
        //EXIT_ON_CLOSE == 3
        frame.setDefaultCloseOperation(3);
        frame.setTitle("JSplitPaneDemo");
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.setSize(400, 320);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
