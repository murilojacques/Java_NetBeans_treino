/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_009;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Murilo
 */
public class SceneController {
    
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private ImageView myImageView;
    @FXML
    private Label myLabel;
    
    Image image1 = new Image(getClass().getResourceAsStream("lampada.png"));
    Image image2 = new Image(getClass().getResourceAsStream("Tom.jpg"));
    
    public void change(ActionEvent event){
        
        if(myCheckBox.isSelected()){
            System.out.println("ON");
            myLabel.setText("ON");
            myImageView.setImage(image1);
        }
        else{
            System.out.println("OFF");
            myLabel.setText("OFF");
            myImageView.setImage(image2);
        }
    }
}
