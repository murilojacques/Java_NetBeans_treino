/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_076;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class WelcomePage extends JFrame{
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();
    
    WelcomePage(String userId){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font("MV Boli", Font.PLAIN, 25));
        welcomeLabel.setText("Welcome " + userId);
        
        frame.add(welcomeLabel);
        frame.setVisible(true);
    }
}
