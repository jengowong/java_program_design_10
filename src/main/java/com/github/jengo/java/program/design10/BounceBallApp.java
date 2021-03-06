package com.github.jengo.java.program.design10;

import javax.swing.JApplet;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BounceBallApp extends JApplet {
    public BounceBallApp() {
        add(new BallControl());
    }

    public static void main(String[] args) {
        BounceBallApp applet = new BounceBallApp();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BounceBallApp");
        frame.add(applet, BorderLayout.CENTER);
        frame.setSize(400, 320);
        frame.setVisible(true);
    }
}
