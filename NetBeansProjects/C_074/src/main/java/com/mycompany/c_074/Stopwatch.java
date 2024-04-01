/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_074;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Stopwatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();

    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;

    String seconds_String = String.format("%02d", seconds);
    String minutes_String = String.format("%02d", minutes);
    String hours_String = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            elapsedTime += 1000;
            hours = (elapsedTime / 3600000) % 24;
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;

            String seconds_String = String.format("%02d", seconds);
            String minutes_String = String.format("%02d", minutes);
            String hours_String = String.format("%02d", hours);

            timeLabel.setText(hours_String + ":" + minutes_String + ":" + seconds_String);
        }

    });

    Stopwatch() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        timeLabel.setText(hours_String + ":" + minutes_String + ":" + seconds_String);
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 38));
        timeLabel.setBounds(140, 130, 200, 100);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(140, 230, 100, 50);
        startButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(240, 230, 100, 50);
        resetButton.setFont(new Font("Ink Free", Font.PLAIN, 20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(resetButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (started == false) {
                started = true;
                startButton.setText("STOP");
                start();
            } else {
                stop();
                started = false;
                startButton.setText("START");
            }
        }

        if (e.getSource() == resetButton) {
            started = false;
            startButton.setText("START");
            reset();
        }
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public void reset() {
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;

        String seconds_String = String.format("%02d", seconds);
        String minutes_String = String.format("%02d", minutes);
        String hours_String = String.format("%02d", hours);

        timeLabel.setText(hours_String + ":" + minutes_String + ":" + seconds_String);
    }

}
