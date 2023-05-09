package com.java.snake;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SnakeGame {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel
        JLabel label = new JLabel("Welcome to Snake Game!");

        // Add the label to the JFrame
        frame.getContentPane().add(label);

        // Set the size of the frame
        frame.setSize(500, 500);

        // Display the frame
        frame.setVisible(true);
    }
}