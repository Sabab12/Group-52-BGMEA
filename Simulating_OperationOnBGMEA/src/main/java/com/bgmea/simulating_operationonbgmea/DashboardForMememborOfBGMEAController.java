package com.bgmea.simulating_operationonbgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardForMememborOfBGMEAController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payYourBillsOnButtonClicked(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RunApplication.class.getResource("PaymentForMemberOfBGMEA.fxml"));
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