package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class ContactController {

    @FXML
    Label contactLabel;
    @FXML
    Label contactTitleLabel;
    public void initialize() {
        contactLabel.setText("How Can We Help?\nReach Us Anytime\nEmail: For further assistance, contact rentalhelp@exclusicar.com.\nLive Chat: Access our 24/7 holographic support by clicking the \"Chat Now\" button on your dashboard.\n" +
                "Call Us: Speak directly with a support agent at 1-800-EXCLUSI (1-800-398-5874).\nVisit Our Main Hub\nOur global headquarters is located at:\nExclusiCar Orbitron Tower\nSkyline 450, New Neo-Tokyo, Earth, 3000 AD.");
        contactTitleLabel.setText("Contact");
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
        handleButtonAction("home-view.fxml", contactLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", contactLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", contactLabel);
    }
    @FXML
    private void handleLoginButton() {
        Platform.exit();
    }

}
