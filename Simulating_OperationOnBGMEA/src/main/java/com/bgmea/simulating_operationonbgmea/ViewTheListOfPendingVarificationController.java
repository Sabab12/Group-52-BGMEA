package com.bgmea.simulating_operationonbgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewTheListOfPendingVarificationController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewFulldataOfSelectedUser(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RunApplication.class.getResource("data varification list valid or not valid.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage= new Stage();
            nextStage.setTitle("Sign Up");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }
}