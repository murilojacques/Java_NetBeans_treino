/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_046;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Murilo
 */
public class Teste_JSlider implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    
    Teste_JSlider(){
        
        frame = new JFrame(" Teste Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        
        slider.setPreferredSize(new Dimension(400, 200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        
        //slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);
        
        slider.addChangeListener(this);
        
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label.setText("°C = "+slider.getValue());
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(450, 450);
        frame.setVisible(true);
        
        
    }
    
    
    
    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == slider){
            label.setText("°C = "+slider.getValue());
        }
    }
    
}
