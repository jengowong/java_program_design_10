package com.github.jengo.java.program.design10;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class ScalingDemo extends JApplet {
    public ScalingDemo() {
        add(new ShapePanel());
    }

    class ShapePanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 10, 10);

            for (int i = 0; i < 4; i++) {
                g2d.draw(rectangle);
                g2d.scale(2, 2);
            }
        }
    }

    /** Main method */
    public static void main(String[] args) {
        JApplet applet = new ScalingDemo();
        applet.init();
        applet.start();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ScalingDemo");
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
