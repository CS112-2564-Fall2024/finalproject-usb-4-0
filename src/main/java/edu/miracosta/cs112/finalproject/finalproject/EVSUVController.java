package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class EVSUVController {

    @FXML
    Label suvNameLabel;
    @FXML
    Label infoLabel;
    @FXML
    Label reserveLabel;
    public void initialize() {
        suvNameLabel.setText(HomeController.suv.getMake() + " " + HomeController.suv.getModel());
        infoLabel.setText(HomeController.suv.toString());
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
    private void handleReserveButton() {
        try {
            if (!(HomeController.user.getBirthYear() > 0)) {
                throw new NotOldEnoughException("Sign up to reserve\n" + HomeController.suv.getMake() + " " + HomeController.suv.getModel() + ".");
            } else {
                int age = calculateAge(HomeController.user.getBirthYear(), HomeController.user.getBirthMonth(), HomeController.user.getBirthDay());
                checkAge(age);
            }
        } catch (NotOldEnoughException noee){
            reserveLabel.setText(noee.getMessage());
        }
    }

    public void checkAge(int age) throws NotOldEnoughException {
        if (age < 21) {
            throw new NotOldEnoughException("You must be 21 or\nolder to reserve.");
        } else {
            reserveLabel.setText("Thank you for reserving!");
        }
    }

    public static int calculateAge(int birthYear, int birthMonth, int birthDay) {

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, currentDate);

        return age.getYears();
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
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", suvNameLabel);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", suvNameLabel);
    }

}
