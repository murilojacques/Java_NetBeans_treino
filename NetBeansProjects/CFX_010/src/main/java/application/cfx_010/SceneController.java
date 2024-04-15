/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_010;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Murilo
 */
public class SceneController {
    
    @FXML
    private RadioButton rButton1, rButton2, rButton3;
   
    @FXML
    private Label myLabel;
    
    
    public void getFood(ActionEvent event){
        
        if(rButton1.isSelected()){
            myLabel.setText(rButton1.getText());
        }
        else if(rButton2.isSelected()){
            myLabel.setText(rButton2.getText());
        }
        else if(rButton3.isSelected()){
            myLabel.setText(rButton3.getText());
        }
        
    }
}
