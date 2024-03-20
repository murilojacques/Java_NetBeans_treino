/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_032;

import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class C_032 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("TITULO, WOW");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(95, 50, 255));
        
        
        ImageIcon imagem = new ImageIcon("OIP.jpg");
        frame.setIconImage(imagem.getImage());
        frame.setVisible(true);
    }
}
