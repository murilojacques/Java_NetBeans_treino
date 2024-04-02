/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_076;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField idField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel labelId = new JLabel("User ID:");
    JLabel labelPassword = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    
    LoginPage(HashMap<String, String> loginInfoOriginal){
        
        loginInfo = loginInfoOriginal;
        
        labelId.setBounds(50, 100, 75, 25);
        labelPassword.setBounds(50, 150, 75, 25);
        
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        
        idField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);
        
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);
        
        
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(idField);
        frame.add(passwordField);
        frame.add(messageLabel);
        frame.add(labelId);
        frame.add(labelPassword);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            idField.setText("");
            passwordField.setText("");
        }
        
        if(e.getSource() == loginButton){
            
            String userId = idField.getText();
            String userPassword = String.valueOf(passwordField.getPassword());
            
            if(loginInfo.containsKey(userId)){
                if(loginInfo.get(userId).equals(userPassword)){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful");
                    
                    frame.dispose();
                    WelcomePage wp = new WelcomePage(userId);
                    
                }
                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password");
                }
            }
            else{
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username not Found");
            }
            
        }
    }
}
