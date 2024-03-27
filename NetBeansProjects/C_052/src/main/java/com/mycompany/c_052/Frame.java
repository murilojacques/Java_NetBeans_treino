/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_052;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements MouseListener{
    
    JLabel label;
    ImageIcon sorrindo;
    ImageIcon secata;
    ImageIcon tabom;
    ImageIcon nervoso;
    
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(550, 550);
        
        sorrindo = new ImageIcon("sorrindo.jpg");
        secata = new ImageIcon("secata.jpg");
        tabom = new ImageIcon("tabom.jpg");
        nervoso = new ImageIcon("nervoso.jpg");
        
        label = new JLabel();
        label.addMouseListener(this);
        label.setIcon(sorrindo);
        
        
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(secata);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(tabom);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervoso);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(sorrindo);
    }
}
