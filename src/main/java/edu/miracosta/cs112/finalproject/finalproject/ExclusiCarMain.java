package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ExclusiCarMain extends Application {

    @Override
    public void start(Stage homeStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        homeStage.setScene(scene);
        homeStage.show();
    }

    public static void main(String[] args) { launch(); }

}