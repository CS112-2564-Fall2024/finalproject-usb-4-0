package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ExclusiCarController {
    Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);
    EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);

    @FXML
    private void handleHomeButton() {
        Platform.exit();
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
        Platform.exit();
    }
    @FXML
    private void handleSUVLearnMoreButton() {
        Platform.exit();
    }


}
