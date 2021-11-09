package com.example.game;


//Java program to create a text field with an initial text and set an event handler once any action occurs in the textfield
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.geometry.Orientation;

public class Game extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }
    int c=0;
    int x=(int)(Math.random()*20);
    @Override
    public void start(Stage stage) throws Exception {

        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        Button btn = new Button("Угадать число!");

        stage.setWidth(500);
        stage.setHeight(400);

        //текст-начало
        Label lblv = new Label("Введите число от 0 до 20!");
        lblv.setFont(new Font("Cambria", 25));
        lblv.setTextFill(Color.web("RED"));


        //реакция кнопки
        btn.setOnAction(event -> {
            int num = Integer.parseInt(textField.getText().trim());
            c++;
            if (c>3) return;
            if (c<3)
            {
                if (num==x) lblv.setText("Игра закончена! Вы выиграли.");
                if (num<x) lblv.setText("Число больше введённого");
                if (num>x) lblv.setText("Число меньше введённого");
            }
            if (c==3)
            {
                if (num==x) lblv.setText("Игра закончена! Вы выиграли.");
                else lblv.setText("Игра закончена. Вы проиграли");
            }
        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField, btn, lblv);
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Угадать число от 0 до 20");
        stage.show();
    }
}