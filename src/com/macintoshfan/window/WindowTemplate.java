package com.macintoshfan.window;

import javax.swing.*;

/**
 * A simple program to show a window with text in Java.
 *
 * @author Macintosh_Fan
 */
public class WindowTemplate {
    /**
     * The main method.
     *
     * @param args does nothing.
     */
    public static void main(String[] args) {
        // Variables optional but helpful
        int width = 400;
        int height = 400;

        JFrame frame = new JFrame("Simple JFrame example");
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.add(panel);

        panel.setSize(width, height);
        panel.setLayout(null);

        // Code starts here
        JLabel label = new JLabel("Hello world!");
        label.setBounds(0, 0, width, 20);
        panel.add(label);
        // Code ends here

        frame.setVisible(true);
    }
}
