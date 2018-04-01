package com.cice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CronoForm{
    private JLabel timeLabel;
    private JButton stopBtn;
    private JButton resetBtn;
    private JButton startButton;
    private JPanel cronoPanel;
    private Crono crono;

    public  CronoForm(){
        guiStart();

        stopBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                crono.setActive(false);
            }
        });

        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                crono.setActive(true);
            }
        });
        resetBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                crono.setActive(false);
                crono.resetTimer();
            }
        });
    }

    public void setCrono(Crono crono) {
        this.crono = crono;
        crono.run();
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    private void guiStart(){
        JFrame frame = new JFrame();
        frame.setContentPane(cronoPanel);
        frame.setMinimumSize(new Dimension(200, 150));
        frame.setTitle("Cronometro to pro!");
        timeLabel.setFont(timeLabel.getFont().deriveFont(16f));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
