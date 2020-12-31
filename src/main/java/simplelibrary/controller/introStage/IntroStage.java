package simplelibrary.controller.introStage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class IntroStage {

    @FXML
    public Pane introStagePane;



    @FXML
    public void initialize(){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/loginPanel.fxml"));
        BorderPane borderPane = null;
        try {
            borderPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        introStagePane.getChildren().add(borderPane);
    }


}
