package ru.mirea.task25;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EndMenu implements Menuu{
    private String label;
    private double score;
    public static StackPane root2 = new StackPane();

    public EndMenu(String label, double score)
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

    public static Parent endinform()
    {
        Label Labelmenu2 = new Label();
        root2.setPrefSize(600,600);
        BackgroundImage myBI2= new BackgroundImage(new Image("https://funart.pro/uploads/posts/2021-04/1618606994_13-funart_pro-p-oboi-fon-pikselnoe-nebo-13.png",500,600,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        try
        {
            Labelmenu2.setFont(new Font("Broadway", 35));
        }
        catch(Exception e)
        {
            Labelmenu2.setFont(new Font("Calibri", 35));
        }
        Labelmenu2.setTextFill(Color.web("RED"));
        Labelmenu2.setTranslateX(10);
        Labelmenu2.setTranslateY(-200);

        Labelmenu2.setText("GAME OVER! LAST SCORE: ");
        root2.getChildren().addAll(Labelmenu2);
        root2.setBackground(new Background(myBI2));

        return root2; //т.к. это корневой узел, возвращаем его
    }
}
