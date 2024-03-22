/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_035;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class MeuFrame extends JFrame implements ActionListener{
    JButton button = new JButton();
    JButton button2 = new JButton();
    
    MeuFrame(){
        ImageIcon imagem = new ImageIcon("joinha.png");
        
        button.setBounds(200, 200, 250, 150);
        button.addActionListener(this);
        button.setText("Clique Aqui");
        button.setFocusable(false);
        button.setIcon(imagem);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.PLAIN, 14));
        button.setIconTextGap(-10);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        
        
        button2.setBounds(100, 100, 100, 50);
        button2.addActionListener(f -> System.out.println("Isso é um botao que funciona com expressão Lambda"));
        button2.setText("Botao 2");
        button2.setVisible(false);
        
        
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.add(button);
        this.add(button2);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Ola, eu sou um Botão");
            button.setEnabled(false);
            button2.setVisible(true);
        }
        
    }
}
