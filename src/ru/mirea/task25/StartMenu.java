package ru.mirea.task25;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class StartMenu implements Menuu{
    private String label;
    private double score;
    public static StackPane root = new StackPane();

    public StartMenu(String label, double score)
    {
        this.label = label;
        this.score = score;
    }
    public double getScore()
    {
        return this.score;
    }

    public String getLabel() {
        return this.label;
    }

    public static Parent inform()
    {

        Label Labelmenu = new Label();
        root.setPrefSize(600,600);
        BackgroundImage myBI2= new BackgroundImage(new Image("https://funart.pro/uploads/posts/2021-04/1618606994_13-funart_pro-p-oboi-fon-pikselnoe-nebo-13.png",500,600,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        try {
            Labelmenu.setFont(new Font("Broadway", 35));
        }
        catch(Exception e) {
            Labelmenu.setFont(new Font("Calibri", 35));
        }
        Labelmenu.setTextFill(Color.web("RED"));
        Labelmenu.setTranslateX(10);
        Labelmenu.setTranslateY(-200);

        Labelmenu.setText("GAME FLAPPY BIRD");
        root.getChildren().addAll(Labelmenu);
        root.setBackground(new Background(myBI2));
        return root; //т.к. это корневой узел, возвращаем его

    }
}
