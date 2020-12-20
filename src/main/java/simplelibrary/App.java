package simplelibrary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* LogInButton Verification
   login: test
   password: 1234
 */

public class App extends Application {

    public static void main(String[] args) { launch(); }



    @Override
    public void start(Stage primaryStage) throws Exception {

        // This code creating connection with FXML
        Parent root = FXMLLoader.load(getClass().getResource
                ("/view/LoginPanelView.fxml"));

        // this code using connection to generate Scene
        primaryStage.setScene(new Scene(root));

        //title top panel of the window
        primaryStage.setTitle("Library - login panel");

        //turn ON Stage
        primaryStage.show();

    }


}


