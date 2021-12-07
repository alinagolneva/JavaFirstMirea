package ru.mirea.task20;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;

    public class Timer extends Application {
        private AnimationTimer timerTime;
        private Label lblTime = new Label("0 .s");
        private int  seconds;

        @Override
        public void start(Stage stage) throws Exception {
            timerTime = new AnimationTimer() {

                private long lastTime = 0;

                @Override
                public void handle(long now) {
                    if (lastTime != 0) {
                        if (now > lastTime + 1_000_000_000) {
                            seconds++;
                            lblTime.setText(Integer.toString(seconds) + " .s");
                            lastTime = now;
                        }
                    } else {
                        lastTime = now;

                    }
                }

                @Override
                public void stop() {
                    super.stop();
                    lastTime = 0;
                    seconds = 0;
                }
            };

        }
    }

