package com.java.snake;
import javax.swing.JFrame;
import com.java.snake.GamePanel;
public class GameFrame extends JFrame{

    private static final long serialVersionUID = 1L;

    GameFrame() {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
