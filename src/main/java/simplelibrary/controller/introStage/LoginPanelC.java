package simplelibrary.controller.introStage;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import simplelibrary.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPanelC {
    
    public Button logInButton;
    public Button signInButton;
    public CheckBox rememberMe;

    public TextField loginField;
    public PasswordField passwordField;
    public Label informationMessage;


    //actions methods

    public void LogInButtonOnAction() throws Exception {
        informationMessage.setText("You try to login");

        if (!loginField.getText().isBlank() && !passwordField.getText().isBlank()) {

            //validation login&&password
            informationMessage.setText("here we check your login and password");
            boolean isConnected = validateLoginAndPassword();

            if (isConnected) {
                createMainPanelView();
            }

        } else if (loginField.getText().isBlank() && !passwordField.getText().isBlank()) {
            informationMessage.setText("Please enter your Login");
        } else if (!loginField.getText().isBlank() && passwordField.getText().isBlank()) {
            informationMessage.setText("Please enter your Password");
        } else {
            informationMessage.setText("Please enter Login and Password");
        }


    }

    public void signInButtonOnAction() throws Exception {
        createRegisterPanelView();
    }



    //validation methods

    private boolean validateLoginAndPassword() {
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectionNow.getConnection();


        String verifyLogin = "SELECT count(1) FROM users WHERE login = '" + loginField.getText() + "' AND password ='" + passwordField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeQuery("USE library");
            ResultSet queryResult = statement.executeQuery(verifyLogin);



            if (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    informationMessage.setText("you are logged!");
                    return true;

                }else{
                    informationMessage.setText("Invalid login or password. Please try again!");
                    return false;
                }

            }
        } catch (Exception e) {

            e.printStackTrace();
            e.getCause();
        }
        return false;
    }


    //create Panel methods

    private void createRegisterPanelView() throws Exception {

        // This code creating connection with FXML
            Parent root = FXMLLoader.load(getClass().getResource
                    ("/view/RegisterPanelView.fxml"));

        // this code using connection to generate Scene
        Stage registerStage = new Stage();

        // this code using connection to generate Scene
        registerStage.setScene(new Scene(root));

        //title top panel of the window
            registerStage.setTitle("University Library DBMS - Register Panel");

        //turn ON Stage
            registerStage.show();

    }

    private void createMainPanelView() throws Exception {

        // This code creating connection with FXML
        Parent viewFXML = FXMLLoader.load(getClass().getResource
                ("/view/MainPanelView.fxml"));

        // new Stage
        Stage registerStage = new Stage();

        // this code using connection to generate Scene
        registerStage.setScene(new Scene(viewFXML));

        //title top panel of the window
        registerStage.setTitle("University Library DBMS - Main Panel");

        registerStage.show();
    }


}
