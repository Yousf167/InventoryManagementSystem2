package org.example.inventorymanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

        final String DB_URL = "jdbc:sqlite:database.db";
        try(Connection conn = DriverManager.getConnection(DB_URL))
        {
            System.out.println("succesfull");
        }
        catch(Exception SQLException)
        {
            System.out.println("unsuccessfull");
        }
    }
}


