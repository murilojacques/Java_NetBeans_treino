/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_047;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Teste_BarraDProgresso {

    JFrame frame = new JFrame();
    
    JProgressBar bar = new JProgressBar(0, 100);
    
    
    Teste_BarraDProgresso() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setLayout(null);

        bar.setValue(0);
        bar.setBounds(10, 0, 410, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Verdana", Font.BOLD, 20));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int i = 0;
        while (i <= 100) {
            try {
                bar.setValue(i);
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Teste_BarraDProgresso.class.getName()).log(Level.SEVERE, null, ex);
            }
            i += 1;
        }
        bar.setString("Terminado!");
    }
}
