package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class UserInfoController {

    @FXML
    Label infoLabel;
    @FXML
    Button signupButton;

    public void initialize() {
        if (HomeController.user.getBirthYear() == 0) {
            infoLabel.setText("Sign Up to show User Information.");
        } else {
            infoLabel.setText(String.format("First Name: %s\n\nLast Name: %s\n\nEmail: %s\n\nDriver's License #: %s\n\nDate Of Birth: %d/%d/%d",
                    HomeController.user.getFirstName(), HomeController.user.getLastName(), HomeController.user.getEmail(),
                    HomeController.user.getDriversLicenseNum(), HomeController.user.getBirthMonth(), HomeController.user.getBirthDay(),
                    HomeController.user.getBirthYear()));
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
        handleButtonAction("home-view.fxml", infoLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", infoLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", infoLabel);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", infoLabel);
    }
    @FXML
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", infoLabel);
    }

}
