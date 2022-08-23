package com.example.finitestatemachine;

import gui.utils.Alerts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("window-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 807, 300);
        stage.setTitle("Finite State Machine");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}