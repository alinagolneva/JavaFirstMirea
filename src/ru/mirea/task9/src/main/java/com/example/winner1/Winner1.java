package com.example.winner1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
    public class Winner1 extends Application {
    int c1=0;
    int c2=0;
    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Winner");
        stage.setWidth(500);
        stage.setHeight(400);

        Group root = new Group();

        //первая кнопка, отвечающая за первую команду
        Button button1 = new Button ("Первая команда");
        button1.setLayoutX(50);
        button1.setLayoutY(200);
        button1.setPrefSize(150,35);

        //вторая кнопка, отвечающая за вторую команду
        Button button2 = new Button ("Вторая команда");
        button2.setLayoutX(280);
        button2.setLayoutY(200);
        button2.setPrefSize(150,35);

        //текст в окне изначальный
        Label label00 = new Label ("Result: 0");
        label00.setFont(new Font("Cambria", 25));
        label00.setTextFill(Color.web("#0076a3"));
        label00.setLayoutX(170);
        label00.setLayoutY(20);

        Label label01 = new Label ("Last Scorer: N/A");
        label01.setFont(new Font("Cambria", 20));
        label01.setTextFill(Color.web("#0076a3"));
        label01.setLayoutX(170);
        label01.setLayoutY(60);

        Label label02 = new Label ("Winner: DRAW");
        label02.setFont(new Font("Cambria", 20));
        label02.setTextFill(Color.web("#0076a3"));
        label02.setLayoutX(170);
        label02.setLayoutY(95);

        Label label03 = new Label ("   X    0");
        label03.setFont(new Font("Cambria", 25));
        label03.setTextFill(Color.web("#0076a3"));
        label03.setLayoutX(270);
        label03.setLayoutY(20);

        //реакция первой кнопки
        button1.setOnAction(event -> {
            c1++;
            if (c1==1) label00.setText("Result: 1");
            if (c1==2) label00.setText("Result: 2");
            if (c1==3) label00.setText("Result: 3");
            if (c1==4) label00.setText("Result: 4");
            if (c1==5) label00.setText("Result: 5");
            if (c1==6) label00.setText("Result: 6");
            if (c1==7) label00.setText("Result: 7");
            if (c1==8) label00.setText("Result: 8");
            if (c1==9) label00.setText("Result: 9");
            if (c1==10) label00.setText("Result: 10");
            if (c1>c2) label01.setText("Last Scorer: N");
            if (c1==c2) label01.setText("Last Scorer: N/A");

        });

        button2.setOnAction(event -> {
            c2++;
            if (c2==1) label03.setText("   X   1");
            if (c2==2) label03.setText("   X   2");
            if (c2==3) label03.setText("   X   3");
            if (c2==4) label03.setText("   X   4");
            if (c2==5) label03.setText("   X   5");
            if (c2==6) label03.setText("   X   6");
            if (c2==7) label03.setText("   X   7");
            if (c2==8) label03.setText("   X   8");
            if (c2==9) label03.setText("   X   9");
            if (c2==10) label03.setText("   X  10");
            if (c1<c2) label01.setText("Last Scorer: A");
            if (c1==c2) label01.setText("Last Scorer: N/A");

        });

        Scene scene = new Scene(root, 400, 400);
        root.getChildren().addAll(button1, button2, label00, label01, label02, label03);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}