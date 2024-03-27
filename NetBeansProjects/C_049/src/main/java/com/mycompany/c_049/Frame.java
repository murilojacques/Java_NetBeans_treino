/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_049;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener{
    
    JButton button;
    
    Frame(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       
       button = new JButton();
       button.setText("Slecionar Arquivo");
       button.addActionListener(this);
       
       this.add(button);
       this.pack();
       this.setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();
            
            //fileChooser.setCurrentDirectory(new File("."));
                    
           int i = fileChooser.showOpenDialog(null); //Serve para selecionar um arquivo para abrir
           //int i = fileChooser.showSaveDialog(null); // Seleciona arquivo para Salvar
           if(i == JFileChooser.APPROVE_OPTION){
               File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
               System.out.println(file);
               
           }
        }
    }
}
