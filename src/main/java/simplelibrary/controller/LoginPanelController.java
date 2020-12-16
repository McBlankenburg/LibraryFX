package simplelibrary.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import simplelibrary.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
            validateLoginAndPassword();

        }else if(loginField.getText().isBlank() == true && passwordField.getText().isBlank() == false){
            informationMessage.setText("Please enter your Login");
        }else if(loginField.getText().isBlank() == false && passwordField.getText().isBlank() == true){
            informationMessage.setText("Please enter your Password");
        } else {
            informationMessage.setText("Please enter Login and Password");
        }


    }

    private void validateLoginAndPassword() {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM users WHERE login = '" + loginField.getText() + "' AND password ='" + passwordField.getText() +"'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeQuery("USE library");
            ResultSet queryResult = statement.executeQuery(verifyLogin);


            while(queryResult.next()){
                if (queryResult.getInt(1) == 1) {
                    informationMessage.setText("you are logged!");
                } else {
                    informationMessage.setText("Invalid login or password. Please try again!");
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();

        }


    }
}

