package simplelibrary.controller;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class LoginPanelController {


    @FXML
    public Button logIn;

    @FXML
    public PasswordField passwordField;

    void initialize(){


    }


    public void onAction(ActionEvent actionEvent) {

        if(passwordField.getText().equals("qwerty"))
            System.out.print("dostęp przyznany");
        }


}
