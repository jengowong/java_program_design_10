package com.github.jengo.java.program.design10;// WelcomeApplet.java: Applet for displaying a message

import javax.swing.JApplet;
import javax.swing.JLabel;

public class WelcomeApplet extends JApplet {
    /** Initialize the applet */
    public void init() {
        add(new JLabel("Welcome to Java", JLabel.CENTER));
    }
}
