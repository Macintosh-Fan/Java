package com.macintoshfan.swing;

import javax.swing.*;
import java.awt.Dimension;

/**
 * A simple program to show a window with text in Java using {@link javax.swing}.
 *
 * @author Macintosh_Fan
 */
public class SwingTemplate {
    /**
     * The main method.
     *
     * @param args does nothing.
     */
    public static void main(String[] args) {
        // Variables optional but helpful
        int width = 400;
        int height = 400;
        boolean windowSize = false;

        JFrame frame = new JFrame("Simple Swing Window Example"); // The window
        JPanel panel = new JPanel();                                   // The content pane in the window

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the program exits when we click [the window] 'x' at the top-left/top-right
        if (windowSize) {
            // Set window size including borders
            frame.setSize(width, height);
        } else {
            // Set content area size in the window
            frame.setPreferredSize(new Dimension(width, height));
            frame.pack();
        }
        frame.add(panel); // Add our panel

        panel.setSize(frame.getContentPane().getSize() /* Get the size of the window content pane */);
        panel.setLayout(null); // No layout; absolute positioning

        // Code starts here
        JLabel label = new JLabel("Hello world!");
        label.setBounds(0, 0, width, 20);
        panel.add(label); // Add our new label to the panel
        // Code ends here

        frame.setVisible(true); // Show our panel
    }
}
