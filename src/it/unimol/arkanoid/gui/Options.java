package it.unimol.arkanoid.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options extends JPanel {
    private static Options options = new Options();
    private JButton back;

    private Options() {
        initPanel();
    }

    private void initPanel() {
        this.setLayout(null);
        this.initButton();
        this.optionsPanel();
    }

    private void initButton() {
        back = new JButton("Go Back");
        back.setBounds(50,50,100,100);
        this.add(back);
    }

    public void optionsPanel() {
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.getInstance().getContentPane().remove(Options.getInstance());
                Frame.getInstance().getContentPane().add(Start.getInstance());
                Frame.getInstance().validate();
                Frame.getInstance().repaint();
            }
        });
    }

    public static Options getInstance() {
        return options;
    }
}