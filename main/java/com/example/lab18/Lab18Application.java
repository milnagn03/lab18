package com.example.lab18;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab18Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("lab18.fxml"));
        stage.setTitle("Simple Chat Form");
        stage.setScene(new Scene(root, 300, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}