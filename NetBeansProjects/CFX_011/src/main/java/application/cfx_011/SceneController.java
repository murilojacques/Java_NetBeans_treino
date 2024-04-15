/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_011;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 *
 * @author Murilo
 */
public class SceneController {
    
    @FXML
    private DatePicker myDatePicker;
    
    @FXML
    private Label myLabel;
    
    
    
    public void getDate(ActionEvent event){
        
        LocalDate myDate = myDatePicker.getValue();
        String myFormatedDate = myDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        myLabel.setText(myFormatedDate);
    }
}
