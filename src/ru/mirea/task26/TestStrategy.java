package ru.mirea.task26;

public class TestStrategy {
    public static void main(String[] args) {

        Windows startt = new StartMenus();
        Windows endd = new EndMenus();

        startt.openWind();
        endd.openWind();

    }
}
