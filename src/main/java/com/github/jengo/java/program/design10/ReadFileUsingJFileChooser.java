package com.github.jengo.java.program.design10;

import javax.swing.JFileChooser;
import java.util.Scanner;

public class ReadFileUsingJFileChooser {
    public static void main(String[] args) throws Exception {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null)
                == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            java.io.File file = fileChooser.getSelectedFile();

            // Create a Scanner for the file
            Scanner input = new Scanner(file);

            // Read text from the file
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }

            // Close the file
            input.close();
        } else {
            System.out.println("No file selected");
        }
    }
}
