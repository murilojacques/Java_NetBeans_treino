/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_080;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Murilo
 */
public class GameFrame extends JFrame{
    
    GamePanel panel;
    
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
