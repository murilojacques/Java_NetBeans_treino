/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_008;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 *
 * @author Murilo
 */
public class SceneController {
    
    @FXML
    private Button myButton;
    @FXML
    private TextField myTextField;
    @FXML
    private Label myLabel;
    
    private int age;
    
    public void submit(ActionEvent event){
        try{
        age = Integer.parseInt(myTextField.getText());
        
        if(age >= 18){
            myLabel.setText("You are now Signed up!"); 
        }
        else{
            myLabel.setText("you must be 18+"); 
        }
        
        }
        catch(NumberFormatException i){
           myLabel.setText("Enter only number plz"); 
           System.out.println("Enter only number plz");
        }
        catch(Exception e){
            myLabel.setText("error");
            System.out.println(e);
        }
    }
}
