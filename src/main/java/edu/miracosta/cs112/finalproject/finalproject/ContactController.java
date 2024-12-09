package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class ContactController {

    @FXML
    Label contactLabel;
    @FXML
    Label contactTitleLabel;
    @FXML
    Label howCanWeHelpLabel;
    @FXML
    Button signupButton;

    public void initialize() {
        contactTitleLabel.setText("Contact");
        howCanWeHelpLabel.setText("How Can We Help?");
        contactLabel.setText("Reach Us Anytime:\n\n\t•\tEmail: For further assistance, contact rentalhelp@exclusicar.com.\n" +
                "\t•\tLive Chat: Access our 24/7 holographic support by pressing F9.\n" +
                "\t•\tCall Us: Speak directly with a support agent at 1-800-EXCLUSI\n\n" +
                "Visit Our Main Hub:\n\nOur global headquarters is located at:\n" +
                "ExclusiCar Orbitron Tower\nSkyline 450, New Neo-Tokyo, Earth, 3000 AD.");
        if (HomeController.user.getBirthYear() > 0) {
            signupButton.setText("Change Info");
        }
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
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", contactLabel);
    }
    @FXML
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", contactLabel);
    }

}
