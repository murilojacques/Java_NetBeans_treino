/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_014;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Murilo
 */
public class SceneController implements Initializable{
    
    @FXML
    private Slider mySlider;
    
    @FXML
    private Label myLabel;
    
    int myTemperature;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        myTemperature = (int) mySlider.getValue();
        myLabel.setText(myTemperature + "Cº");
        
        mySlider.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number t, Number t1) {
                
                myTemperature = (int) mySlider.getValue();
                myLabel.setText(myTemperature + "Cº");
            }
            
        });
    }
    
    
}
