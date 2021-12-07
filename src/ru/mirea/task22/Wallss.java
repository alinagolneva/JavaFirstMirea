package ru.mirea.task22;

import ru.mirea.task17.Wallsss;

enum Exwalls {
    Nwall , Onwall, Twowall, Threewall, Fwall
}

class WallsssFactory {

    public static void main(String[] args) {
            Exwalls type;
            type = Exwalls.Twowall;
            Wallsss w = null;
            switch (type) {
                case Nwall:
                    w = new BottomW();
                    System.out.println("Данная стена находится снизу");
                    break;
                case Onwall:
                    w = new TopW();
                    System.out.println("Данная стена находится сверху");
                    System.out.println("Координаты первой стены "  + ": { 0, 0 }, { 1, 0 }, { 0, 15 }, { 15, 15 }");
                    break;
                case Fwall:
                    w = new TopW();
                    System.out.println("Данная стена находится сверху");
                    System.out.println("Координаты данной стены "  + ": { 35, 5 }, { 36, 5 }, { 36, 15 }, { 35, 15 }");
                    break;
                case Twowall:
                    w = new BottomW();
                    System.out.println("Данная стена находится снизу");
                    System.out.println("Координаты данной стены " + ": { 10, 2 }, { 11, 2 }, { 11, 15 }, { 10, 15 }");
                    break;
                case Threewall:
                    w = new BottomW();
                    System.out.println("Данная стена находится снизу");
                    System.out.println("Координаты данной стены " +  ": { 20, 10 }, { 21, 10 }, { 21, 15 }, { 20, 15 }");
                    break;
            }
        }
    }


