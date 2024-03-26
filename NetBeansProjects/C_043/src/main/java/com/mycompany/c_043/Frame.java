/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_043;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener{
    
    JButton button;
    JCheckBox checkBox;
    ImageIcon checkMark;
    ImageIcon xIcon;
    
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton();
        button.setText("enviar");
        button.addActionListener(this);
        
        xIcon = new ImageIcon("red-X.png");
        checkMark = new ImageIcon("good.png");
        
        checkBox = new JCheckBox();
        checkBox.setText("Mim num é Robo");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 24));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkMark);
        
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}
