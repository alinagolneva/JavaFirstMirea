package ru.mirea.task26;

public class Windows {

    public void exWind()
    {
        System.out.println("Закрытие окна.");
    }

    OpenStrategy openStrategy;

    public void openWind() {
        openStrategy.openWind();
    }

}
