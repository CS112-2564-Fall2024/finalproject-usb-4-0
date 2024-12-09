package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class TruckController {

    @FXML
    Label truckNameLabel;
    @FXML
    Label infoLabel;
    @FXML
    Label reserveLabel;
    @FXML
    Button signupButton;

    public void initialize() {
        truckNameLabel.setText(HomeController.truck.getMake() + " " + HomeController.truck.getModel());
        infoLabel.setText(HomeController.truck.toString());
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
    private void handleReserveButton() {
        try {
            if (!(HomeController.user.getBirthYear() > 0)) {
                throw new NotOldEnoughException("Sign up to reserve\n" + HomeController.truck.getMake() + " " + HomeController.truck.getModel() + ".");
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
            reserveLabel.setText("Thank you for reserving!\nPlease come in to our location\nfound in the \"Contact\" tab\nwithin the next week to pickup.");
        }
    }

    public static int calculateAge(int birthYear, int birthMonth, int birthDay) {

        // We found the following way to look up the current date and used it to check the age to see if
        // the individual is eligible to rent the car. Even though our "company" is in the future, we still
        // wanted to use the current date to be more user-friendly.
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        Period age = Period.between(birthDate, currentDate);

        return age.getYears();
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
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", truckNameLabel);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", truckNameLabel);
    }

}
