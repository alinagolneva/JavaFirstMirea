package com.example.cardsin;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.geometry.Orientation;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class CardsIn extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }
    int c=0;
    int x=(int)(Math.random()*20);
    @Override
    public void start(Stage stage) throws Exception {

        TextField textField1 = new TextField();
        textField1.setPrefColumnCount(11);
        TextField textField2 = new TextField();
        textField2.setPrefColumnCount(11);
        Button btn = new Button("Сыграть");

        stage.setWidth(500);
        stage.setHeight(400);

        //текст-начало
        Label lblv = new Label("Введите первую колоду карт в первое поле," +
                " вторую колоду - во второе");
        lblv.setFont(new Font("Cambria", 15));
        lblv.setTextFill(Color.web("Blue"));


        //реакция кнопки
        btn.setOnAction(event -> {
            LinkedList<Integer> stack1 = new LinkedList<>();
            LinkedList<Integer> stack2 = new LinkedList<>();
            Integer[] intar=new Integer[5];
            for (int i=0; i<5; i++) {
                intar[i]=Integer.parseInt(textField1.getText().trim());
            }
            for (int i=0; i<5; i++)
                stack1.add(intar[i]);
            for (int i=0; i<5; i++) {
                intar[i]=Integer.parseInt(textField2.getText().trim());
            }
            for (int i=0; i<5; i++)
                stack2.add(intar[i]);
            int c=0;
            while (!stack1.isEmpty() && !stack2.isEmpty() && c < 106) {
                if ((stack1.peek() > stack2.peek()) && stack2.peek() != 0) {
                    stack1.addLast(stack2.pop());
                    stack1.addLast(stack1.pop());
                }
                else {
                    stack2.addLast(stack1.pop());
                    stack2.addLast(stack2.pop());
                }
                c++;
            }
            if (c>=106) lblv.setText("botva");
            if (stack2.isEmpty()) lblv.setText("first "+c);
            if (stack1.isEmpty()) lblv.setText("second "+ c);

        });

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField1, textField2, btn, lblv);
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Карточная игра");
        stage.show();
    }
}