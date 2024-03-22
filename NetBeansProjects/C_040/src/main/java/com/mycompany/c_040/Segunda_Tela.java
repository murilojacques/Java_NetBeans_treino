/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_040;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murilo
 */
public class Segunda_Tela {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Opa, Como vai?");
    
    
    Segunda_Tela(){
        
        label.setBounds(5, 0, 180, 50);
        label.setFont(new Font("Verdana", Font.PLAIN, 21));
        
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
