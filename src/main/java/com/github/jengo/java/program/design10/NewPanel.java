package com.github.jengo.java.program.design10;

import javax.swing.*;
import java.awt.*;

public class NewPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 0, 50, 50);
        g.drawString("Banner", 0, 40);
    }
}
