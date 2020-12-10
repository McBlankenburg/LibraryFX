package simplelibrary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class App extends Application {


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage loginPanelStage) throws Exception {

        loginPanelStage.setTitle("Simple Library CRM - login panel");
        Pane loginPanelPane = FXMLLoader.load(getClass().getResource("/view/LoginPanelView.fxml"));
        Scene scene = new Scene(loginPanelPane);
        loginPanelStage.setScene(scene);
        loginPanelStage.show();
    }


}


