/*package ru.mirea.task8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ap1FX extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {

        com.example.task8.Ap1FX app1fx = new com.example.task8.Ap1FX();
        //Creating an image
        Image image1 = new Image(new FileInputStream("C:\\Users\\Alina\\Downloads\\шаг1.png"));
        Image image2 = new Image(new FileInputStream("C:\\Users\\Alina\\Downloads\\шаг2.png"));
        Image image3 = new Image(new FileInputStream("C:\\Users\\Alina\\Downloads\\шаг3.png"));
        Image image4 = new Image(new FileInputStream("C:\\Users\\Alina\\Downloads\\шаг4.png"));
        //Setting the image view
        ImageView imageView = new ImageView();

        //Setting the position of the image
        imageView.setX(60);
        imageView.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        Timeline timeline = new Timeline(

                new KeyFrame(Duration.ZERO, new KeyValue(imageView.imageProperty(), image1)),
                new KeyFrame(Duration.seconds(0.4), new KeyValue(imageView.imageProperty(), image2)),
                new KeyFrame(Duration.seconds(0.8), new KeyValue(imageView.imageProperty(), image3)),
                new KeyFrame(Duration.seconds(1.1), new KeyValue(imageView.imageProperty(), image4)),
                new KeyFrame(Duration.seconds(1.5), new KeyValue(imageView.imageProperty(), null))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        Group root = new Group();
        root.getChildren().add(imageView);
        //Creating a scene object
        Scene scene = new Scene(root, 600, 500);

        //Setting title to the Stage
        stage.setTitle("Анимация");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}*/