/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_045;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener{
    JComboBox comboBox;
    Integer[] numeros = {1, 2, 3};
    String[] animais = {"cachorro", "gato", "passaro"};
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        //comboBox = new JComboBox(numeros);
        comboBox = new JComboBox(animais);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("rato");
        /**comboBox.insertItemAt("Mamarcos", 0);
        comboBox.setSelectedIndex(0);**/
        //comboBox.removeItem("gato");
        //comboBox.removeItemAt(2);
        //comboBox.removeAllItems();
        
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
        System.out.println(comboBox.getSelectedItem());
        
        /**int i = comboBox.getSelectedIndex();
        switch(i){
            case 0:
                System.out.println(animais[i]);
                break;
            case 1:
                System.out.println(animais[i]);
                break;
            case 2:
                System.out.println(animais[i]);
                break;
        }**/
        
      }
    }
}
