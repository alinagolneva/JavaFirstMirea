package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Scanner;


public class CardsAr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();
        int num;
        System.out.println("Введите первую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            stack1.push(num);
        }
        System.out.println("Введите вторую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            stack2.push(num);
        }
        int c=0;
        while (!stack1.isEmpty() && !stack2.isEmpty() && c < 106) {
            if ((stack1.peek() > stack2.peek()) && stack2.peek() != 0) {
                stack1.addLast(stack2.pop());
                stack1.addLast(stack1.pop());
            }
            else {
                stack2.addLast(stack1.pop());
                stack2.addLast(stack2.pop());
            }
            c++;
        }
        if (c>=106)
            System.out.println("botva");
        if (stack2.isEmpty()) System.out.println("First");
        if (stack1.isEmpty()) System.out.println("Second");
        System.out.println(c);
    }
}
