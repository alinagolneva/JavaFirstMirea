package ru.mirea.task14;
import java.util.Scanner;
import java.util.Stack;
public class Cards
{
    private static void  pushback(Stack<Integer> stk, int m, int n) {

        Stack<Integer> nstk = new Stack<>();
        while (!stk.isEmpty()) {
            nstk.push(stk.pop());
        }
        stk.push(n);
        stk.push(m);
        while (!nstk.isEmpty()) {
            stk.push(nstk.pop());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> help = new Stack<Integer>();
        int num;
        System.out.println("Введите первую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            help.push(num);
        }
        for (int i=0; i<5; i++) stack1.push(help.pop());
        System.out.println("Введите вторую колоду карт: ");
        for (int i=0; i<5; i++) {
            num = sc.nextInt();
            help.push(num);
        }
        for (int i=0; i<5; i++) stack2.push(help.pop());
        int c=0;
        while (!stack1.isEmpty() && !stack2.isEmpty() && c < 106) {
            if ((stack1.peek() > stack2.peek()) && stack2.peek() != 0) {
                pushback(stack1, stack2.pop(), stack1.pop());
            }
            else {
                pushback(stack2, stack1.pop(), stack2.pop());
            }
            c++;
        }
        if (c>=106)
        System.out.println("botva");
        if (stack2.empty()) System.out.println("First");
        if (stack1.empty()) System.out.println("Second");
        System.out.println(c);
    }
}
