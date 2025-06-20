package com.example.sqlfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/sqlfx/login.fxml"));

            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
            stage.setTitle("Password Manager");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
