package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class TruckController {
    Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);

    @FXML
    Label truckNameLabel;
    @FXML
    Label infoLabel;
    public void initialize() {
        truckNameLabel.setText(truck.getMake() + " " + truck.getModel());
        infoLabel.setText(truck.toString());
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

}
