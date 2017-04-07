package com.github.jengo.java.program.design10;

import javax.swing.JFrame;

public class TestPaintComponent extends JFrame {
    public TestPaintComponent() {
        add(new NewPanel());
    }

    public static void main(String[] args) {
        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("TestPaintComponent");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

