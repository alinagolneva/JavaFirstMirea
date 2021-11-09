package ru.mirea.task14;

import java.util.*;

public class CardsQ {
    private static void  pushback(Queue<Integer> stk, int m, int n) {

        Queue<Integer> nstk = new LinkedList<>();
        while (!stk.isEmpty()) {
            nstk.add(stk.poll());
        }
        stk.add(n);
        stk.add(m);
        while (!nstk.isEmpty()) {
            stk.add(nstk.poll());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        int num;
        System.out.println("Введите первую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            stack1.add(num);
        }
        System.out.println("Введите вторую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            stack2.add(num);
        }

        int c=0;
        while (!stack1.isEmpty() && !stack2.isEmpty() && c < 106) {
            if ((stack1.peek() > stack2.peek()) && stack2.peek() != 0) {
                pushback(stack1, stack2.poll(), stack1.poll());
            }
            else {
                pushback(stack2, stack1.poll(), stack2.poll());
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
