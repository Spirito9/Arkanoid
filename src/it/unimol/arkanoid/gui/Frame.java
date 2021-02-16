package it.unimol.arkanoid.gui;

import javax.swing.*;

public class Frame extends JFrame {
    private static Frame frame = new Frame();

    private Frame() {
        initFrame();
        startGame();
    }
    public void initFrame() {
        this.setSize(315, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //roba vecchio frame----------
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        //---------------
    }

    public void startGame() {
        this.getContentPane().add(Start.getInstance());
        this.repaint();
    }

    public static Frame getInstance() {
        return frame;
    }
}