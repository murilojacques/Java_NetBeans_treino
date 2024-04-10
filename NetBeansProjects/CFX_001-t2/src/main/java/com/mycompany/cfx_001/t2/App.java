package com.mycompany.cfx_001.t2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

   
    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Stage stage = new Stage();      // Essa linha e para criar outro Stage
        
        Group root = new Group();
        Scene scene  = new Scene(root, Color.BLACK);
        
        
        primaryStage.setTitle("Stage Demo Program w00t w00t");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);
        primaryStage.setResizable(false);
        //primaryStage.setX(50);
        //primaryStage.setY(50);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("VOCE NAO PODE ESCAPAR a nao ser que aperte q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

}