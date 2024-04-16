/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.cfx_015;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Murilo
 */
public class Controller implements Initializable{
    
    @FXML
    private ProgressBar myProgressBar;
    
    @FXML
    private Button myButton;
    
    @FXML
    private Label myLabel;
    
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0).replace(",", "."));
    
    
    public void increaseProgress(){
        if(progress.doubleValue() <= 1){
        progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1).replace(",", "."));
        myProgressBar.setProgress(progress.doubleValue());
        myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue()*100)) + "%");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        myProgressBar.setStyle("-fx-accent: #009900;");
    }
}
