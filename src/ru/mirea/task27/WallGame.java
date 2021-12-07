package ru.mirea.task27;

import java.util.HashMap;

public class WallGame {
    public static void main(String[] args) {
        HashMap<Integer, String> hanems = new HashMap<>();

        hanems.put(20, "FWalls");
        hanems.put(15, "ThreeWalls");
        hanems.put(17, "TwoWalls");
        hanems.put(16, "SWalls");
        hanems.put(5, "Onwall");

        String name = hanems.get(15);
        System.out.println(name);


        hanems.remove(16);
        System.out.println(hanems.containsKey(17));
        System.out.println(hanems);
    }
}
