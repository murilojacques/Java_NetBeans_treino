/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_054;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Murilo
 */
public class MyPanel extends JPanel{
    
    Image image;
    
    MyPanel(){
        image = new ImageIcon("secata.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }
    
    
    public void paint(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(image, 0, 0, null);
        
        g2d.setStroke(new BasicStroke(4));
        g2d.setPaint(Color.BLUE);
        //g2d.drawLine(0, 0, 500, 500);
        
        //g2d.setPaint(Color.orange);
        //g2d.drawRect(50, 30, 100, 220);
        //g2d.fill3DRect(200, 150, 130, 270, true);
        //g2d.fillRect(50, 30, 100, 220);
        
        
        //g2d.drawOval(0, 0, 250, 250);
        //g2d.fillOval(0, 0, 250, 250);
        
       
        g2d.setPaint(Color.RED);
        g2d.fillArc(7, 10, 107, 110, 0, 180);
        g2d.setPaint(Color.BLACK);
        g2d.drawArc(10, 15, 102, 100, 180, 180);
        g2d.setPaint(Color.WHITE);
        g2d.fillArc(12, 15, 98, 98, 180, 180);
        g2d.setStroke(new BasicStroke(2));
        g2d.setPaint(Color.BLACK);
        g2d.drawLine(12, 65, 112, 65);
        g2d.fillOval(50, 53, 25, 25);
        g2d.setPaint(Color.WHITE);
        g2d.fillOval(52, 55, 20, 20);
        g2d.setPaint(Color.LIGHT_GRAY);
        g2d.fillOval(55, 58, 15, 15);
       
       
       
       /**
        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2d.setPaint(Color.cyan);
        //g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);
        * **/
       
       
       //g2d.setFont(new Font("Ink Free", Font.BOLD, 35));
       //g2d.drawString("Salve Meu Bom", 50, 50);
       
       
    }
}
