package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class SignupController {

    User user = new User();
    @FXML
    Label signupTitleLabel;
    @FXML
    TextField firstNameField;
    @FXML
    TextField lastNameField;
    @FXML
    TextField emailField;
    @FXML
    TextField licenseNumberField;
    @FXML
    TextField dobYearField;
    @FXML
    TextField dobMonthField;
    @FXML
    TextField dobDayField;

    public void initialize() {
        signupTitleLabel.setText("Sign Up");
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
        handleButtonAction("home-view.fxml", signupTitleLabel);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", signupTitleLabel);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", signupTitleLabel);
    }
    @FXML
    private void handleSubmitButton() {
        user.setFirstName(firstNameField.getText());
        user.setLastName(lastNameField.getText());
        user.setEmail(emailField.getText());
        user.setDriversLicenseNum(licenseNumberField.getText());
        user.setBirthYear(Integer.parseInt(dobYearField.getText()));
        user.setBirthMonth(Integer.parseInt(dobMonthField.getText()));
        user.setBirthDay(Integer.parseInt(dobDayField.getText()));

        handleButtonAction("home-view.fxml", signupTitleLabel);


    }

}