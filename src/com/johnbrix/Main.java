package com.johnbrix;

import animatefx.animation.FlipInX;
import com.johnbrix.controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    Parent root;
    private double x,y;
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader= new FXMLLoader(getClass().getResource("view/sample.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        new FlipInX(root).play();
        primaryStage.show();

        Controller controller = loader.getController();
        controller.animationFX();
        controller.keyPressedEnter();

        root.setOnMousePressed(event ->
        {
            x =event.getSceneX();
            y =event.getSceneY();
        } );
        //pag hold mo mouseDragged
        root.setOnMouseDragged(event ->
        {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        } );

    }


    public static void main(String[] args) {
        launch(args);
    }
}
