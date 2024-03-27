/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_053;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.AbstractAction;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Game {

    JLabel label;
    JFrame frame;
    Action downAction;
    Action upAction;
    Action leftAction;
    Action rightAction;

    Game() {
        frame = new JFrame("Teste de KeyBinding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setBounds(100, 100, 100, 100);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "up");
        label.getActionMap().put("up", upAction);
        
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "down");
        label.getActionMap().put("down", downAction);
        
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "left");
        label.getActionMap().put("left", leftAction);
        
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "right");
        label.getActionMap().put("right", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-7);
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+7, label.getY());
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-7, label.getY());
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+7);
        }
    }
}
