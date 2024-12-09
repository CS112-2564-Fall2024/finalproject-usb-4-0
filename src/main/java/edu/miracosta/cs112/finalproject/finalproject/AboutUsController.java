package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class AboutUsController {

    @FXML
    Label aboutUsLabel1;
    @FXML
    Label aboutUsLabel2;
    @FXML
    Label aboutUsTitleLabel;
    @FXML
    Label whyUsLabel;
    @FXML
    Button signupButton;

    public void initialize() {
        aboutUsTitleLabel.setText("About Us");
        aboutUsLabel1.setText("Welcome to ExclusiCar, the future of car rentals. Founded in 2500 and reimagined for the year 3000, " +
                "our mission is simple: to revolutionize the way humanity (and beyond) moves. Whether you’re exploring Earth’s revitalized jungles, " +
                "zipping between Martian colonies, or gliding through the rings of Saturn, ExclusiCar provides the ultimate transportation experience.");
        whyUsLabel.setText("Why Choose Us?");
        aboutUsLabel2.setText("\t•\tGalactic Reach: Rentals available across the solar system.\n" +
                "\t•\tSmart Fleet: AI-powered vehicles tailored to your needs.\n" +
                "\t•\tEco-Conscious: Sustainable technology for a cleaner universe.\n" +
                "\t•\tCustom Rides: Hovercars, deep-sea pods, and more.\n\n" +
                "From humble beginnings on Earth to leading interplanetary mobility, ExclusiCar is your partner in exploration. Travel smarter. Travel the future. 🌌");
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
    private void handleHomeButton() {
        handleButtonAction("home-view.fxml", aboutUsLabel1);
    }
    @FXML
    private void handleAboutUsButton() {
        handleButtonAction("aboutus-view.fxml", aboutUsLabel1);
    }
    @FXML
    private void handleContactButton() {
        handleButtonAction("contact-view.fxml", aboutUsLabel1);
    }
    @FXML
    private void handleSignupButton() {
        handleButtonAction("signup-view.fxml", aboutUsLabel1);
    }
    @FXML
    private void handleUserInfoButton() {
        handleButtonAction("userInfo-view.fxml", aboutUsLabel1);
    }

}
