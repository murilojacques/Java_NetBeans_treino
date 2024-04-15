/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_006;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.*;

/**
 *
 * @author Murilo
 */
public class Scene2Controller {
    
    @FXML
    Label nameLabel;
    
    public void displayName(String username){
        nameLabel.setText("Hello: "+username);
    }
}
