package ru.mirea.task25;

public class TestMenu {
    public static void main(String[] args) {

        Menuu start = new StartMenu("", 0);
        Menuu end = new EndMenu("", 0);
        Menuu showTest = new OptEndMenu(end);
        Menuu showTest1 = new OptStMenu(start);

        System.out.println(showTest1.getLabel());
        System.out.println(showTest1.getScore());
        System.out.println(showTest.getLabel());
        System.out.println(showTest.getScore());
    }
}
