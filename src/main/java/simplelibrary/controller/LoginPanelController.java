package simplelibrary.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPanelController{

    @FXML

    public Button logInButton;
    public Button signInButton;
    public CheckBox rememberMe;

    public TextField loginField;
    public PasswordField passwordField;
    public Label informationMessage;


    public void LogInButtonOnAction(ActionEvent actionEvent) {
        informationMessage.setText("You try to login");

        if(loginField.getText().isBlank() == false && passwordField.getText().isBlank() == false){
            //validation login&&password
            informationMessage.setText("here we check your login and password");


        }else if(loginField.getText().isBlank() == true && passwordField.getText().isBlank() == false){
            informationMessage.setText("Please enter your Login");
        }else if(loginField.getText().isBlank() == false && passwordField.getText().isBlank() == true){
            informationMessage.setText("Please enter your Password");
        } else {
            informationMessage.setText("Please enter Login and Password");
        }


    }
}

