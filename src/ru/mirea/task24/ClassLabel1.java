package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassLabel1
{
    public static void main(String[] args) {
        String labelMenu = "GAME FLAPPY BIRD";
        String labelMenuEnd = "GAME OVER! LAST SCORE: ";
        String labelIcon = "Игра Flappy Bird";

        Pattern pattern = Pattern.compile("\\s");
        String[] strings1 = pattern.split(labelMenu);
        for (String s : strings1) {
            System.out.println(s);
        }

        Pattern pattern1 = Pattern.compile("! LAST SCORE");
        System.out.println(Pattern.matches("И.+d",labelIcon));
        Matcher matcher = pattern1.matcher(labelMenuEnd);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + labelMenuEnd.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }

    }
}

