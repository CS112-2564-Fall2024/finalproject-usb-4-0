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

    @FXML
    private void handleTruckLearnMoreButton() {
        try {
            FXMLLoader truckLoader = new FXMLLoader(getClass().getResource("truck-view.fxml"));
            Stage truckStage = new Stage();
            Scene scene = new Scene(truckLoader.load(), 1280, 720);
            truckStage.setScene(scene);
            truckStage.show();

            Stage currentStage = (Stage) suvNameLabel.getScene().getWindow();
            currentStage.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleSUVLearnMoreButton() {
        try {
            FXMLLoader suvLoader = new FXMLLoader(getClass().getResource("suv-view.fxml"));
            Stage suvStage = new Stage();
            Scene scene = new Scene(suvLoader.load(), 1280, 720);
            suvStage.setScene(scene);
            suvStage.show();

            Stage currentStage = (Stage) truckNameLabel.getScene().getWindow();
            currentStage.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
