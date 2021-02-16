package it.unimol.arkanoid.gui;

import it.unimol.arkanoid.app.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel {
    private static Start start = new Start();
    private JButton play, options;

    private Start() {
        initPanel();
    }

    private void initPanel() {
        this.setLayout(null);
        this.initButton();
        this.startPanel();
    }

    private void initButton() {
        play = new JButton("Start Game");

        options = new JButton("Options");
        play.setBounds(100,100,100,50);
        options.setBounds(100,150,100,50);
        this.add(play);
        this.add(options);
    }

    public void startPanel() {
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.getInstance().getContentPane().remove(Start.getInstance());
                Frame.getInstance().getContentPane().add(Board.getInstance());


                Frame.getInstance().validate();
                Frame.getInstance().repaint();
            }
        });
        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.getInstance().getContentPane().remove(Start.getInstance());
                Frame.getInstance().getContentPane().add(Options.getInstance());
                Frame.getInstance().validate();
                Frame.getInstance().repaint();
            }
        });

    }

    public static Start getInstance() {
        return start;
    }
}