/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_059;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Murilo
 */
public class C_059 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();
        
        for(int i =0; i < 4; i++){
            deck.add(new JLabel(new ImageIcon(i+".jpg")));
            frame.add(deck.get(i));
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
