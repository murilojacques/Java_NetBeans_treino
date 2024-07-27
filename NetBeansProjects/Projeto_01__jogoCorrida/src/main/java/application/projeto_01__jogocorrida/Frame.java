/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.projeto_01__jogocorrida;

import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame{
     
     public Frame(myPanel panel){
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         this.add(panel);
         this.setLocationRelativeTo(null);
         this.pack();
         this.setVisible(true);
     }
}
