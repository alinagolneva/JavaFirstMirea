package ru.mirea.task16.src.com.metanit;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static com.metanit.FlappyBird.*;


public class Menu {



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

        Labelmenu2.setText("GAME OVER! LAST SCORE: "+score1);
        root2.getChildren().addAll(Labelmenu2);
        root2.setBackground(new Background(myBI2));

        return root2; //т.к. это корневой узел, возвращаем его
    }

    public static void stage1build()
    {
        Stage stage1 = new Stage();
        stage1.setTitle("Игра Flappy Bird"); // установка заголовка
        stage1.setWidth(600);            // установка ширины
        stage1.setHeight(600);
        // установка длины
        Scene scene1 = new Scene(inform());
        stage1.setScene(scene1);
        stage1.show();
    }

    public static void stage2build()
    {
        Stage stage2 = new Stage();

        stage2.setTitle("Game Over"); // установка заголовка
        stage2.setWidth(600);            // установка ширины
        stage2.setHeight(600);
        // установка длины
        Scene scene2 = new Scene(Menu.endinform());
        stage2.setScene(scene2);
        stage2.show();
        scene2.setOnMouseClicked(event -> {
            Platform.exit();
        });
    }
}
