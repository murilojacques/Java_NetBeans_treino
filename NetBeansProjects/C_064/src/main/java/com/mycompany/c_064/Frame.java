/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_064;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame {

    JButton button = new JButton("Botao");
    JButton button2 = new JButton("Botao 2");
    
    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        
        button.setBounds(100, 100, 200, 90);
        button.addActionListener(
                (e) -> {
                    System.out.print("Salve ");
                    System.out.println("Como Vai?");
                }
        );
        
        
        button2.setBounds(100, 200, 200, 90);
        button2.addActionListener(
                (e) -> System.out.println("Sou um Botao")
        );
        
        
        this.add(button);
        this.add(button2);
        //this.pack();
        this.setVisible(true);
    }
}
