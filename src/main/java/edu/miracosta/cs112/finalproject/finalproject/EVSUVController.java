package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class EVSUVController {
    EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);

    @FXML
    Label suvNameLabel;
    @FXML
    Label infoLabel;
    public void initialize() {
        suvNameLabel.setText(suv.getMake() + " " + suv.getModel());
        infoLabel.setText(suv.toString());
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
        handleButtonAction("home-view.fxml", suvNameLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", suvNameLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", suvNameLabel);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", suvNameLabel);
    }

}
