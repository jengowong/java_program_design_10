package com.github.jengo.java.program.design10;

import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        String input =
                JOptionPane.showInputDialog(null,
                        "Enter an input",
                        "Input Dialog Demo",
                        JOptionPane.QUESTION_MESSAGE);
    }
}
