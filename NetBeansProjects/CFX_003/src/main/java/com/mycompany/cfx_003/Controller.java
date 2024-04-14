/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cfx_003;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Murilo
 */
public class Controller{
    
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    
    public void up(ActionEvent e){
       // System.out.println("UP");
        myCircle.setCenterY(y -= 10);
    }
    
    public void down(ActionEvent e){
        //System.out.println("DOWN");
        myCircle.setCenterY(y += 10);
    }
    
    public void left(ActionEvent e){
        //System.out.println("LEFT");
        myCircle.setCenterX(x -= 10);
    }
    
    public void right(ActionEvent e){
        //System.out.println("RIGHT");
        myCircle.setCenterX(x += 10);
    }

    
}
