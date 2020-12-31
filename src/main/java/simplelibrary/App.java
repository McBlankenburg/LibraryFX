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
    public void start(Stage introStage) throws Exception {


        // This code creating connection with FXML
        Parent root = FXMLLoader.load(getClass().getResource
                ("/view/IntroStage.fxml"));

        // this code using connection to generate Scene
        introStage.setScene(new Scene(root));

        //title top panel of the window
        introStage.setTitle("example");

        //turn ON Stage
        introStage.show();

    }


}


