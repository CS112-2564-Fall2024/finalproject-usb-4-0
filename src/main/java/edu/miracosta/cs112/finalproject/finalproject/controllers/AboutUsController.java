package edu.miracosta.cs112.finalproject.finalproject.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class AboutUsController {

    @FXML
    Label aboutUsLabel;
    @FXML
    Label aboutUsTitleLabel;
    public void initialize() {
        aboutUsLabel.setText("Here at ExclusiCar, we offer high end rentals for all your daily needs. Founded in 2950, we keep only the highest quality vehicles to suit your needs. Our small selection allows us to keep up with the interplanetary demands, allowing the customer to get the same experience throughout the solar system.");
        aboutUsTitleLabel.setText("About Us");
    }

    @FXML
    private void handleButtonAction(String fxmlResource, Label element){
        try {
            FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlResource));
            Stage homeStage = new Stage();
            Scene scene = new Scene(homeLoader.load(), 1280, 720);
            homeStage.setScene(scene);
            homeStage.show();

            Stage currentStage = (Stage) element.getScene().getWindow();
            currentStage.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleHomeButton() {
        handleButtonAction("home-view.fxml", aboutUsLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", aboutUsLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", aboutUsLabel);
    }
    @FXML
    private void handleLoginButton() {
        Platform.exit();
    }

}
