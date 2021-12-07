package ru.mirea.task23;

public class ClassLabel
{
    public static void main(String[] args) {
    String labelMenu = "GAME FLAPPY BIRD";
    String labelMenuEnd = "GAME OVER! LAST SCORE: ";
    String labelIcon = "Игра Flappy Bird";

    System.out.println("Хэш-код для Str: " + labelIcon.hashCode());
    System.out.println("Хэш-код для Str: " + labelMenu.hashCode());
    System.out.println("Хэш-код для Str: " + labelMenuEnd.hashCode());

    }
}
