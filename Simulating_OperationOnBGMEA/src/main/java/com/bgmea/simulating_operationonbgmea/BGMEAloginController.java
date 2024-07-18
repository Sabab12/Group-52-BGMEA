package com.bgmea.simulating_operationonbgmea;

import com.sun.tools.javac.Main;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BGMEAloginController
{
    @javafx.fxml.FXML
    public void initialize() {

    }

    @Deprecated
    public void signUpOnButtonClicked(Event event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sign UP page.fxml"));
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
