package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
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
    public void initialize() {
        truckNameLabel.setText(truck.getMake() + " " + truck.getModel());
    }


    @FXML
    private void handleHomeButton() {
        try {
            FXMLLoader homeLoader = new FXMLLoader(getClass().getResource("home-view.fxml"));
            Stage homeStage = new Stage();
            Scene scene = new Scene(homeLoader.load(), 1280, 720);
            homeStage.setScene(scene);
            homeStage.show();

            Stage currentStage = (Stage) truckNameLabel.getScene().getWindow();
            currentStage.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleAboutUsButton() {
        Platform.exit();
    }
    @FXML
    private void handleContactButton() {
        Platform.exit();
    }
    @FXML
    private void handleLoginButton() {
        Platform.exit();
    }


}
