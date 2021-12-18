package ru.mirea.task16.src.com.metanit;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Wall extends Pane {
    Rectangle rect;
    public int height;
    public Wall(int height)
    {
        this.height = height;
        rect = new Rectangle (30, height);
        getChildren().add(rect);
    }

    public int getheight()
    {
        try {
            return this.height;
        }
        catch(Exception e) {
            return -1;
        }
    }

}
