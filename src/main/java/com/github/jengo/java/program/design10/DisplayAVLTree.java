package com.github.jengo.java.program.design10;

import javax.swing.*;

public class DisplayAVLTree extends JApplet {
    public DisplayAVLTree() {
        add(new TreeControl(new AVLTree<Integer>()));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DisplayAVLTree");
        JApplet applet = new DisplayAVLTree();
        frame.add(applet);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}