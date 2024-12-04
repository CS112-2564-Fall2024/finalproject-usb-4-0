package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


import java.io.IOException;

public class ExclusiCarMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExclusiCarMain.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 375);
        stage.setScene(scene);
        stage.show();

        Truck truck = new Truck(5, 800, "Titanium", "Commander", 3000, 140, 100.00, 6900);
        EVSUV suv = new EVSUV(8, 600, "NovaFlux", "Aurora", 2999, 169, 120.00, 50, 30);


    }

    public static void main(String[] args) { launch(); }
}