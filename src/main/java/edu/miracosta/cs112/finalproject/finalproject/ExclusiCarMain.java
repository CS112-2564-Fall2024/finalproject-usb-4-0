package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class ExclusiCarMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /* AnchorPane topPane = new AnchorPane();
        topPane.setStyle("-fx-background-color: #ADD8E6;"); // Light blue background

        AnchorPane mainPane = new AnchorPane();
        mainPane.setStyle("-fx-background-color: #FFC0CB;"); // Pink background

        SplitPane ui = new SplitPane();
        ui.setOrientation(javafx.geometry.Orientation.VERTICAL);
        ui.getItems().addAll(topPane, mainPane);
        ui.setDividerPositions(0.2);

        Button homeButton = new Button("Home");
        homeButton.setFont(new Font("Arial", 30));
        AnchorPane.setTopAnchor(homeButton, 10.0);
        AnchorPane.setLeftAnchor(homeButton, 20.0);
        topPane.getChildren().add(homeButton);

        Button aboutUsButton = new Button("About Us");
        aboutUsButton.setFont(new Font("Arial", 30));
        AnchorPane.setTopAnchor(aboutUsButton, 10.0);
        AnchorPane.setLeftAnchor(aboutUsButton, 170.0);
        topPane.getChildren().add(aboutUsButton);

        Button contactButton = new Button("Contact");
        contactButton.setFont(new Font("Arial", 30));
        AnchorPane.setTopAnchor(contactButton, 10.0);
        AnchorPane.setLeftAnchor(contactButton, 320.0);
        topPane.getChildren().add(contactButton);

         */

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setScene(scene);
        stage.show();

        Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);
        EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);


    }

    public static void main(String[] args) { launch(); }
}