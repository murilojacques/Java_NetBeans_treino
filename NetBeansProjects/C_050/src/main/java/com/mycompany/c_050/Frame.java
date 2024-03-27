/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_050;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
    
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Escolha uma cor");
        button.addActionListener(this);
        
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setText("isso e um texto :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 85));
        
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
           JColorChooser colorChooser = new JColorChooser();
           Color color1 = JColorChooser.showDialog(null, "Escolha A Cor Da Fonte", Color.BLACK);
           label.setForeground(color1);
           
            Color color2 = JColorChooser.showDialog(null, "Escolha a Cor de Fundo", Color.BLACK);
           label.setBackground(color2);
        }
    }
}
