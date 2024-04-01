/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_073;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame{
    
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel labelHorario;
    JLabel labelDia;
    JLabel labelData;
    String horario;
    String dia;
    String data;
    
    Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Relogio");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setLocationRelativeTo(null);
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        labelHorario = new JLabel();
        labelHorario.setFont(new Font("Verdana", Font.PLAIN, 50));
        labelHorario.setForeground(new Color(0x00ff00));
        labelHorario.setBackground(Color.BLACK);
        labelHorario.setOpaque(true);
       
        labelDia = new JLabel();
        labelDia.setFont(new Font("Ink Free", Font.PLAIN, 35));
        
        labelData = new JLabel();
        labelData.setFont(new Font("Ink Free", Font.PLAIN, 25));
        
        
        this.add(labelHorario);
        this.add(labelDia);
        this.add(labelData);
        this.setResizable(false);
        this.setVisible(true);
        
        setTime();
    }
    
    public void setTime(){
        while(true){
        horario = timeFormat.format(Calendar.getInstance().getTime()); 
        labelHorario.setText(horario);
        
        dia = dayFormat.format(Calendar.getInstance().getTime());
        labelDia.setText(dia);
        
        data = dateFormat.format(Calendar.getInstance().getTime());
        labelData.setText(data);
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
