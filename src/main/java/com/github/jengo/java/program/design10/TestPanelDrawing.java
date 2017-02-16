package com.github.jengo.java.program.design10;

import javax.swing.*;
import java.awt.*;

public class TestPanelDrawing extends JFrame {
    public TestPanelDrawing() {
        JComponent j = new NewPanel();
        j.setBackground(Color.RED);
        add(j);
    }

    public static void main(String[] args) {
        TestPanelDrawing frame = new TestPanelDrawing();
        frame.setTitle("TestPanelDrawing");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

