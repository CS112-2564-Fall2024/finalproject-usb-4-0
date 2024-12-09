package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class HomeController {

    public static class User {

        // Instance Variables
        private String firstName;
        private String lastName;
        private String email;
        private String driversLicenseNum;
        private int birthYear;
        private int birthMonth;
        private int birthDay;

        // Default Constructor
        public User() {
            firstName = "";
            lastName = "";
            email = "";
            driversLicenseNum = "";
            birthYear = 0;
            birthMonth = 0;
            birthDay = 0;
        }

        // Full Constructor
        public User(String firstName, String lastName, String email, String driversLicenseNum, int birthYear, int birthMonth, int birthDay) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
            this.birthMonth = birthMonth;
            this.birthDay = birthDay;
            this.email = email;
            this.driversLicenseNum = driversLicenseNum;
        }

        // Getters / Accessors
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getEmail() {
            return email;
        }
        public String getDriversLicenseNum() {
            return driversLicenseNum;
        }
        public int getBirthYear() {
            return birthYear;
        }
        public int getBirthMonth() {
            return birthMonth;
        }
        public int getBirthDay() { return birthDay; }

        // Setters / Mutators
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setDriversLicenseNum(String driversLicenseNum) {
            this.driversLicenseNum = driversLicenseNum;
        }
        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }
        public void setBirthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
        }
        public void setBirthDay(int birthDay) {
            this.birthDay = birthDay;
        }

    }

    static Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);
    static EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);
    static User user = new User();

    @FXML
    Label truckNameLabel;
    @FXML
    Label suvNameLabel;
    @FXML
    Button signupButton;

    public void initialize() {
        truckNameLabel.setText(truck.getMake() + " " + truck.getModel());
        suvNameLabel.setText(suv.getMake() + " " + suv.getModel());
        if (HomeController.user.getBirthYear() > 0) {
            signupButton.setText("Change Info");
        }
    }

    @FXML
    public void handleButtonAction(String fxmlResource, Label element){
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
