/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_013;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Murilo
 */
public class SceneController implements Initializable{
    
    @FXML
    private ChoiceBox<String> myChoiceBox;
    
    @FXML
    private Label myLabel;
    
    private String[] food = {"Pizza", "Hamburguer", "Churrasco", "Calzone", "Sushi"};

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);
        
    }
    
    public void getFood(ActionEvent event){
        
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }
    
}
