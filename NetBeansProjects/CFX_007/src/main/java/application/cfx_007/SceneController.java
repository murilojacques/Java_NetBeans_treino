/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_007;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Murilo
 */
public class SceneController {
    
    @FXML
    ImageView myImageView;
    Button myButton;
    Image myImage = new Image(getClass().getResourceAsStream("Tom.jpg"));
    
    public void switchImage(ActionEvent event){
        myImageView.setImage(myImage);
    }
}
