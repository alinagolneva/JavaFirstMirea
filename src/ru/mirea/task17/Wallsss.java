package ru.mirea.task17;

enum Exwalls {
    Nwall , Onwall, Twowall, Threewall, Fwall
}

class Wallsss
{
    public static void main(String[] args) {
   Exwalls obj; // объявляется переменная obj перечислимого типа ExWalls

    obj = Exwalls.Nwall; //  переменной obj присваивается значение Nwall

    // вывести значение перечислимого типа
        System.out.println("Координаты незаданной стены " + obj + ": { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }");

        obj = Exwalls.Onwall;
        if (obj==Exwalls.Onwall)
        System.out.println("Координаты первой стены " + obj + ": { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 }");

        obj = Exwalls.Twowall;

        // применить перечисление для управления оператором switch
    switch (obj) {
        case Nwall:
            System.out.println("Координаты незаданной стены " + obj + ": { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 }");
            break;
        case Onwall:
            System.out.println("Координаты первой стены " + obj + ": { 0, 0 }, { 1, 0 }, { 0, 15 }, { 15, 15 }");
            break;
        case Twowall:
            System.out.println("Координаты второй стены " + obj + ": { 10, 2 }, { 11, 2 }, { 11, 15 }, { 10, 15 }");
            break;
        case Threewall:
            System.out.println("Координаты третьей стены " + obj + ": { 20, 10 }, { 21, 10 }, { 21, 15 }, { 20, 15 }");
            break;
        case Fwall:
            System.out.println("Координаты четвертой стены " + obj + ": { 35, 5 }, { 36, 5 }, { 36, 15 }, { 35, 15 }");
            break;
    }
}
}

