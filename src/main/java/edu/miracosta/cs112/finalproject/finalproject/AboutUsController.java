package edu.miracosta.cs112.finalproject.finalproject;

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
        aboutUsLabel.setText("Welcome to ExclusiCar, your gateway to the future of travel. Since 2500, we've revolutionized transportation, offering eco-friendly," +
                "AI-driven vehicles for every journey—whether on Earth, Mars, or beyond.\nWhy Choose Us?\nGalactic Reach: Rentals available across the solar system.\n" +
                "Smart Fleet: AI-powered vehicles tailored to your needs.\nEco-Conscious: Sustainable technology for a cleaner universe.\nCustom Rides: Hovercars, " +
                "deep-sea pods, and more.\nFrom humble beginnings on Earth to leading interplanetary mobility, ExclusiCar is your partner in exploration. Travel smarter. " +
                "Travel the future. \uD83C\uDF0C\n\n");
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
