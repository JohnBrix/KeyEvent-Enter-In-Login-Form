package com.johnbrix.controller;

import animatefx.animation.Swing;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField password;

    @FXML
    private Label programmingPh;

    @FXML
    private Label javaDeveloper;

    public void animationFX(){
        new Swing(programmingPh).play();

    }
    public void dangerDialog(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("INVALID");
        alert.setHeaderText("Please correct your username or password");
        alert.setContentText("Be aware what you input!");
        alert.showAndWait();
    }
    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }
    public void keyPressedEnter(){
        username.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                //DO YOUR METHOD
                System.out.println("working enter username");
            }

        });
        password.setOnKeyPressed(event -> {

            if(event.getCode().equals(KeyCode.ENTER)){
                //DO YOUR METHOD
                System.out.println("working enter password");
            }
        });

    }

    public void login(ActionEvent actionEvent) {
        System.out.println("clicked");
    }
}
