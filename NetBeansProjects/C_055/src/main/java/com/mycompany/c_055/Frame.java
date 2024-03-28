/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_055;

import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame{
    
    MyPanel panel;
    
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new MyPanel();
        
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}
