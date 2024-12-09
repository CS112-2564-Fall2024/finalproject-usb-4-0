package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class SignupController {

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

    static User user = new User();
    boolean[] fieldsWithErrors = {false, false, false, false, false, false, false};

    public void initialize() {
        signupTitleLabel.setText("Sign Up");
    }

    @FXML
    private void handleButtonAction(String fxmlResource, Label element) {
        try {
            FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlResource));
            Stage homeStage = new Stage();
            Scene scene = new Scene(homeLoader.load(), 1280, 720);
            homeStage.setScene(scene);
            homeStage.show();

            Stage currentStage = (Stage) element.getScene().getWindow();
            currentStage.close();

        } catch (IOException e) {
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
        try {

            dobYearField.setPromptText("");
            dobMonthField.setPromptText("");
            dobDayField.setPromptText("");

            validateFields();

            user.setFirstName(firstNameField.getText());
            user.setLastName(lastNameField.getText());
            user.setEmail(emailField.getText());
            user.setDriversLicenseNum(licenseNumberField.getText());
            user.setBirthYear(Integer.parseInt(dobYearField.getText()));
            user.setBirthMonth(Integer.parseInt(dobMonthField.getText()));
            user.setBirthDay(Integer.parseInt(dobDayField.getText()));

            handleButtonAction("home-view.fxml", signupTitleLabel);

        } catch (IllegalArgumentException iae) {
            String errorMessages = iae.getMessage();
            String[] errors = errorMessages.split("\n");

            for (int i = 0; i < errors.length; i++) {
                if (errors[i].equals("Required")) {
                    if (fieldsWithErrors[0]) {
                        firstNameField.clear();
                        firstNameField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[1]) {
                        lastNameField.clear();
                        lastNameField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[2]) {
                        emailField.clear();
                        emailField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[3]) {
                        licenseNumberField.clear();
                        licenseNumberField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[4] && !dobYearField.getPromptText().contains("Invalid")) {
                        dobYearField.clear();
                        dobYearField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[5] && !dobMonthField.getPromptText().contains("Invalid")) {
                        dobMonthField.clear();
                        dobMonthField.setPromptText("Required");
                    }
                    if (fieldsWithErrors[6] && !dobDayField.getPromptText().contains("Invalid")) {
                        dobDayField.clear();
                        dobDayField.setPromptText("Required");
                    }
                } else if (errors[i].contains("Invalid")) {
                    if (errors[i].contains("Year")) {
                        dobYearField.clear();
                        dobYearField.setPromptText(errors[i]);
                    }
                    if (errors[i].contains("Month")) {
                        dobMonthField.clear();
                        dobMonthField.setPromptText(errors[i]);
                    }
                    if (errors[i].contains("Day")) {
                        dobDayField.clear();
                        dobDayField.setPromptText(errors[i]);
                    }
                }
            }
        }
    }

    private void validateFields() {
        String[] errors = new String[10];
        int numErrors = 0;

        for (int i = 0; i < fieldsWithErrors.length; i++) {
            fieldsWithErrors[i] = false;
        }

        if (firstNameField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[0] = true;
            numErrors += 1;
        }

        if (lastNameField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[1] = true;
            numErrors += 1;
        }

        if (emailField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[2] = true;
            numErrors += 1;
        }

        if (licenseNumberField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[3] = true;
            numErrors += 1;
        }

        if (dobYearField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[4] = true;
            numErrors++;
        } else {
            int updatedErrors = validateIntegerField(dobYearField, "Year", errors, numErrors);
            if (updatedErrors > numErrors) {
                fieldsWithErrors[4] = true;
                numErrors = updatedErrors;
            }
        }

        // Validate dobMonthField
        if (dobMonthField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[5] = true;
            numErrors++;
        } else {
            int updatedErrors = validateIntegerField(dobMonthField, "Month", errors, numErrors);
            if (updatedErrors > numErrors) {
                fieldsWithErrors[5] = true;
                numErrors = updatedErrors;
            }
        }

        // Validate dobDayField
        if (dobDayField.getText().isEmpty()) {
            errors[numErrors] = "Required";
            fieldsWithErrors[6] = true;
            numErrors++;
        } else {
            int updatedErrors = validateIntegerField(dobDayField, "Day", errors, numErrors);
            if (updatedErrors > numErrors) {
                fieldsWithErrors[6] = true;
                numErrors = updatedErrors;
            }
        }

        if (numErrors > 0) {
            String errorMessages = "";
            for (int i = 0; i < numErrors; i++) {
                errorMessages += errors[i] + "\n";
            }
            throw new IllegalArgumentException(errorMessages);
        }
    }

    private int validateIntegerField(TextField field, String fieldName, String[] errorList, int errorCount) {
        try {
            if (field.getText().isEmpty()) {
                return errorCount;
            }
            int value = Integer.parseInt(field.getText());
            if (value <= 0) {
                errorList[errorCount] = "Invalid " + fieldName;
                errorCount += 1;
            }
        } catch (NumberFormatException nfe) {
            errorList[errorCount] = "Invalid " + fieldName;
            errorCount += 1;
        }
        return errorCount;
    }
}