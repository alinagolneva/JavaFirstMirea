package ru.mirea.task13;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        String str1 = new String("Number 1");
        String str2 = new String("Number 2");
        String str3 = new String("Number 3");
        String str4 = new String("Number 4");

        LinkedList<String> num = new LinkedList<>();
        num.add(str1);
        num.add(str2);
        num.add(str3);
        num.add(1, str4);
        System.out.println(num);
        num.remove(2);
        System.out.println(num);
        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());
        System.out.println(num.contains("Number 1"));
        System.out.println(num.size());
        System.out.println(num.contains("Number 4"));
        System.out.println(num.contains("Number 5"));
    }
}
