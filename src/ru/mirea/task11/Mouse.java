package com.example.music;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Tooltip;


public class Mouse1 extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button left = new Button("West");
        BorderPane.setAlignment(left, Pos.CENTER);


        Button right = new Button("East");
        BorderPane.setAlignment(right, Pos.CENTER);

        Button top = new Button("North");
        BorderPane.setAlignment(top, Pos.CENTER);

        Button bottom = new Button("South");
        BorderPane.setAlignment(bottom, Pos.CENTER);

        Button center = new Button("Center");
        BorderPane.setAlignment(center, Pos.CENTER);



        Tooltip b_east = new Tooltip("Добро пожаловать в EAST");
        right.setTooltip(b_east);

        Tooltip b_west = new Tooltip("Добро пожаловать в WEST");
        left.setTooltip(b_west);

        Tooltip b_north = new Tooltip("Добро пожаловать в NORTH");
        top.setTooltip(b_north);

        Tooltip b_south = new Tooltip("Добро пожаловать в SOUTH");
        bottom.setTooltip(b_south);

        Tooltip b_center = new Tooltip("Добро пожаловать в CENTER");
        center.setTooltip(b_center);

        BorderPane root = new BorderPane(center, top, right, bottom, left);
        Scene scene = new Scene(root,300,150);
        stage.setScene(scene);

        stage.setTitle("Mouse");

        stage.show();
    }
}