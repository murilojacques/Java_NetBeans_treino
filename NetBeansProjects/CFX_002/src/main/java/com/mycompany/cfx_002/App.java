package com.mycompany.cfx_002;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
       
        Group root = new Group();
        Scene scene  = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        Stage stage = new Stage();
        
        Text text = new Text("");
        text.setText("WHOOOOOA!!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.ROYALBLUE);
        
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(80);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(3);
        line.setStroke(Color.CRIMSON);
        line.setOpacity(1);
        line.setRotate(20);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.INDIGO);
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.PERU);
        
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0, 150.0, 
                250.0, 250.0,
                350.0, 250.0
                );
        triangle.setFill(Color.GOLD);
        
        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(500);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
        
        //Image image = new Image("C:\\Users\\Murilo\\Downloads");
        //ImageView imageView = new ImageView(image);
        //imageView.setX(500);
        //imageView.setY(480);
        
        //root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        
        stage.setScene(scene);
        stage.show();
    }

}