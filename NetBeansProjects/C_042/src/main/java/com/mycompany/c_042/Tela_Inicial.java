/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_042;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Murilo
 */
public class Tela_Inicial extends JFrame implements ActionListener{
        JButton button = new JButton("enviar");
        JTextField field = new JTextField();
    Tela_Inicial(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
       
        button.addActionListener(this);
        
        
        
        field.setPreferredSize(new Dimension(240, 40));
        field.setFont(new Font("Consoles", Font.PLAIN, 25));
        field.setForeground(Color.GREEN);
        field.setBackground(Color.BLACK);
        field.setCaretColor(Color.WHITE);
        field.setText("username");
        
        
        this.add(button);
        this.add(field);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Bem Vindo " + field.getText());  
            field.setEditable(false);
            button.setEnabled(false);
        }
    }
    
}
