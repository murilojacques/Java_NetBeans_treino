/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_062;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame {

    JButton button1 = new JButton("Botao #1");
    JButton button2 = new JButton("Botao #2");
    JButton button3 = new JButton("Botao #3");

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        button1.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mim e Botao #1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eu so o Botao n #2");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eu sou o Botao de numero #3");
            }
        });

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setVisible(true);
    }
}
