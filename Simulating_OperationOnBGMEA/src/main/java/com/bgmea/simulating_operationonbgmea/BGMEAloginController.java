package com.bgmea.simulating_operationonbgmea;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.EventObject;

public class BGMEAloginController {
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> groupComboBox;
    @javafx.fxml.FXML
    private PasswordField passwordTextFirld;

    @javafx.fxml.FXML
    public void initialize() {
        groupComboBox.getItems().addAll("Member of BGMEA", "Member Relations Officer");

    }

    @javafx.fxml.FXML
    public void signUpOnButtonClicked(Event event) {
        try {
            FXMLLoader fxmlLoader =new FXMLLoader(RunApplication.class.getResource("Sign UP page.fxml"));
            Scene nextScene =new Scene(fxmlLoader.load());
            Stage nextStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            nextStage.setTitle("Sign Up");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void logInOnActionButton(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RunApplication.class.getResource("Sign UP page.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            System.out.println(Scene.class);

            Stage nextStage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Sign Up");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }




        }
    }

