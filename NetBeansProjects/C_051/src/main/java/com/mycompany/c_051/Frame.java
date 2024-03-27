/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_051;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon image;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        image = new ImageIcon("Space_rocket.png");
        label = new JLabel();
        label.setBounds(150, 150, 48, 48);
        label.setIcon(image);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() -5);
                break;
            case 'a':
                label.setLocation(label.getX() -5, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() +5);
                break;
            case 'd':
                label.setLocation(label.getX() +5, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 38:
                label.setLocation(label.getX(), label.getY() -5);
                break;
            case 37:
                label.setLocation(label.getX() -5, label.getY());
                break;
            case 39:
                label.setLocation(label.getX()+5, label.getY() );
                break;
            case 40:
                label.setLocation(label.getX() , label.getY()+5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == this) {

            
              System.out.println("\nVoce soltou a tecla: " + e.getKeyChar());
              System.out.println("E o numero dessa Tecla e: " + e.getKeyCode());
             
        }
    }

}
