package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class HomeController {

    Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);
    EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);

    @FXML
    Label truckNameLabel;
    @FXML
    Label suvNameLabel;
    public void initialize() {
        truckNameLabel.setText(truck.getMake() + " " + truck.getModel());
        suvNameLabel.setText(suv.getMake() + " " + suv.getModel());
        SignupController.user.setFirstName("Sign Up to Show Details");
        SignupController.user.setLastName("Sign Up to Show Details");
        SignupController.user.setEmail("Sign Up to Show Details");
        SignupController. user.setDriversLicenseNum("Sign Up to Show Details");
        SignupController.user.setBirthYear(2000);
        SignupController.user.setBirthMonth(1);
        SignupController.user.setBirthDay(1);
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
        handleButtonAction("home-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleTruckLearnMoreButton() {
        handleButtonAction("truck-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleSUVLearnMoreButton() {
        handleButtonAction("suv-view.fxml", truckNameLabel);
    }

}
