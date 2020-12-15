package simplelibrary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class App extends Application {


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Library - login panel");
        BorderPane loginPanelPane = FXMLLoader.load(getClass().getResource("/view/LoginPanelView.fxml"));
        Scene scene = new Scene(loginPanelPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}


