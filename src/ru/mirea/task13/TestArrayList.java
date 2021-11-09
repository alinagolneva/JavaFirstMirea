package ru.mirea.task13;
import java.util.ArrayList;

public class TestArrayList
{
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("David");
        names.add("Xiao");
        names.add("Bob");
        names.add("Ella");
        names.add("Kate");

        int index = names.indexOf("Xiao");
        System.out.println(index);
        System.out.println(names.contains("Kate"));
        System.out.println(names.contains("Klee"));
        names.remove(5);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());

    }
}
