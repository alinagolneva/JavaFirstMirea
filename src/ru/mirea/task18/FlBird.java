package ru.mirea.task18;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
public class FlBird {

    public void start(Stage stage) throws MouseException {

        Scene scene = new Scene(createContent());

        scene.setOnMouseClicked(event -> {
            try {
                bird.jump();
            } catch (MouseException e) {
                e.printStackTrace();
            }
        });


        stage.setScene(scene);
        stage.show();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                update();
            }
        };
        timer.start();


    }
}
