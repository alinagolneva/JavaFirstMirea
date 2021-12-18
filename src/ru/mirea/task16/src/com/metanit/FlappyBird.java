package ru.mirea.task16.src.com.metanit;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends Application{
    public static Pane appRoot = new Pane(); //панель самого приложения
    public static Pane gameRoot = new Pane(); //панель игры, стенок
    public static StackPane root = new StackPane();
    public static StackPane root2 = new StackPane();
    public static int c=0;
    public static ArrayList<Wall> walls = new ArrayList<>(); //хранятся стены для проверки столкновений
    public static ArrayList<Integer> units = new ArrayList<>();
    Bird bird = new Bird(); // сама птичка
    public static int score=0; // переменная, отвечающая за счёт
    public static int score1=0;
    private long _openTime = 0;
    private long _closeTime = 0;
    public Label scoreLabel = new Label("Score: "+score);


    public static ArrayList<Integer> unit()
    {
        for (int i=0; i< 10; i++) //создание стенки каждой итерации
        {
            units.add(i);
        }
        return units;
    }



    public Parent createContent()
    {
        gameRoot.setPrefSize(600,600);// ниже: создание столбцов

        for (int i=0; i< 100; i++) //создание стенки каждой итерации
        {
            int enter = (int)(Math.random()*100+80);//число в диапазоне от 50 до 150, ширина проема для птицы
            int height = new Random().nextInt(600-enter); //высота стенки
            Wall wall = new Wall(height);
            wall.setTranslateX(i*350+600);//через каждые 350пикс будет стена, отодвигаем на 600
            wall.setTranslateY(0);
            walls.add(wall); //добавляем стену в список стен

            Wall wall2 = new Wall(600-enter- wall.getheight());
            wall2.setTranslateX(i*350+600);
            wall2.setTranslateY(wall.getheight()+enter);
            walls.add(wall2);

            gameRoot.getChildren().addAll(wall,wall2);

        }
        BackgroundImage myBI= new BackgroundImage(new Image("https://funart.pro/uploads/posts/2021-04/1618606994_13-funart_pro-p-oboi-fon-pikselnoe-nebo-13.png",500,600,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        try
        {
            scoreLabel.setFont(new Font("Broadway", 30));
        }
        catch(Exception e)
        {
            scoreLabel.setFont(new Font("Calibri", 30));
        }
        try
        {
            lblTime.setFont(new Font("Broadway", 30));
        }
        catch(Exception e)
        {
            lblTime.setFont(new Font("Calibri", 30));
        }
        lblTime.setTextFill(Color.web("RED"));
        lblTime.setLayoutX(500);
        scoreLabel.setTextFill(Color.web("RED"));
        scoreLabel.setLayoutX(250);
        gameRoot.getChildren().add(bird);
        appRoot.getChildren().addAll(gameRoot);
        appRoot.getChildren().addAll(scoreLabel);
        appRoot.getChildren().addAll( lblTime);
        appRoot.setBackground(new Background(myBI));
        return appRoot; //т.к. это корневой узел, возвращаем его
    }




    public void update ()
    {
        if (bird.velocity.getY()<5) //гравитация
        {
            bird.velocity = bird.velocity.add(0,1);
        }
        if (bird.MoveY((int)bird.velocity.getY()) && score>=0) scoreLabel.setText("Score: "+ score/2);
                if (bird.MoveX((int) bird.velocity.getX()) == false || bird.MoveY((int) bird.velocity.getY()) == false) {
                    c++;
                    scoreLabel.setLayoutX(100);
                    scoreLabel.setText("Game Over! Click to exit");
                }
        if (score>0) score1=score/2;
        bird.translateXProperty().addListener((obs,old,newValue)->{
            int offset = newValue.intValue();
            if (offset>200) gameRoot.setLayoutX(-(offset));
        });
    }

    void cleanup()
    {
        score=0;
    }

    public long getOpenTime() {
        long closed = _closeTime;

        // if the window is still open, use current time...
        if (closed == 0) {
            closed = System.currentTimeMillis();
        }

        return (closed - _openTime);
    }

    public void onWindowOpened(WindowEvent evt) {
        _openTime = System.currentTimeMillis();
    }

    public void onWindowClosed(WindowEvent evt) {
        _closeTime = System.currentTimeMillis();
        System.out.println(getOpenTime());  // DEBUG
    }

    private Label lblTime = new Label("0 .s");
    private int  seconds;

    @Override
    public void start(Stage stage) {

        Menu.stage1build();
        Image imageOk = new Image("https://sun9-7.userapi.com/impg/HX11wpRue4Q6Q1mgLbdR4dAXHRYCYt58W8q80w/BoPMNk44l-o.jpg?size=200x70&quality=96&sign=7578ddbc642ed0fd104e3efe61d024a6&type=album");
        Button button = new Button("", new ImageView(imageOk));
        button.setPrefSize(180, 63);
        button.setStyle("-fx-background-color: transparent;");
        button.setOnAction(new EventHandler<ActionEvent>() {


            public void handle(ActionEvent event1) {

                Scene scene = new Scene(createContent());

                scene.setOnMouseClicked(event -> {
                    try {
                        bird.jump();

                    } catch (MouseException e) {
                        cleanup();
                        stage.close();
                        seconds = 0;
                    }
                });

                stage.setScene(scene);
                stage.show();
                AnimationTimer timer = new AnimationTimer() {
                    private long lastTime = 0;
                    @Override
                    public void handle(long l) {
                        update();
                        if (lastTime != 0) {
                            if (l > lastTime + 1_000_000_000) {
                                seconds++;
                                lblTime.setText(Integer.toString(seconds) + ".s");
                                lastTime = l;
                            }
                        } else {
                            lastTime = l;
                        }
                    }
                };
                timer.start();
            }
        });
        root.getChildren().add(button);
    }

    public static void main(String[] args) {

         launch(args);
    }
}