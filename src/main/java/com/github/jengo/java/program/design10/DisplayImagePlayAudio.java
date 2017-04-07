package com.github.jengo.java.program.design10;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class DisplayImagePlayAudio extends JApplet {
    private AudioClip audioClip;

    public DisplayImagePlayAudio() {
        URL urlForImage = getClass().getResource("image/denmark.gif");
        add(new JLabel(new ImageIcon(urlForImage)));

        URL urlForAudio = getClass().getResource("audio/denmark.mid");
        audioClip = Applet.newAudioClip(urlForAudio);
        audioClip.loop();
    }

    public void start() {
        if (audioClip != null) audioClip.loop();
    }

    public void stop() {
        if (audioClip != null) audioClip.stop();
    }

    /** Main method */
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("DisplayImagePlayAudio");

        // Create an instance of the applet
        DisplayImagePlayAudio applet = new DisplayImagePlayAudio();
        applet.init();

        // Add the applet instance to the frame
        frame.add(applet, java.awt.BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        frame.setSize(200, 500);
        frame.setVisible(true);
    }
}
