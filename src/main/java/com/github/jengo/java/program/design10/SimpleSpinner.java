package com.github.jengo.java.program.design10;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SimpleSpinner extends JApplet {
    // Create a JSpinner
    private JSpinner spinner = new JSpinner();

    // Create a JLabel
    private JLabel label = new JLabel("", JLabel.CENTER);

    public SimpleSpinner() {
        // Add spinner and label to the UI
        add(spinner, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);

        // Register and create a listener
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Previous value: " + spinner.getPreviousValue()
                        + " Current value: " + spinner.getValue()
                        + " Next value: " + spinner.getNextValue());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(
                "SimpleSpinner");

        SimpleSpinner applet = new SimpleSpinner();

        // Add the applet instance to the frame
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Invoke init and start
        applet.init();
        applet.start();

        // Display the frame
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

