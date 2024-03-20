/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_034;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Murilo
 */
public class C_034 {

    public static void main(String[] args) {
        ImageIcon imagem = new ImageIcon("joinha.png");
        
        JLabel label = new JLabel();
        label.setText("Salve");
        label.setIcon(imagem);
        label.setIconTextGap(-100);
        label.setSize(150, 150);
        label.setBounds(0, 0, 150, 150);
        label.setForeground(new Color(0, 0, 0));
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
        bluePanel.add(label);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.add(label);
        
        JFrame frame = new JFrame();
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        
        //frame.pack();
    }
}
