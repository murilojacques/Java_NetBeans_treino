/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_044;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener{
        JRadioButton pizzaButton;
        JRadioButton hamburgerButton;
        JRadioButton hotdogButton;
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburguer");
        hotdogButton = new JRadioButton("Hotdog");
        
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
        
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton){
            System.out.println("Eu compro Pizza");
        }
        else if(e.getSource() == hamburgerButton){
            System.out.println("Eu compro Hamburger");
        }
        else if(e.getSource() == hotdogButton){
            System.out.println("Eu compro Hotdog");
        }
    }
}
