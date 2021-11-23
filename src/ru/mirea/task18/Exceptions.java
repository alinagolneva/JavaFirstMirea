package ru.mirea.task18;
import javafx.application.Platform;
public class Exceptions extends Exception{
    public Exceptions()
    {
        Platform.exit();
    }
}
