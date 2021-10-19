package ru.mirea.task10;
import java.util.Scanner;
public class Exmpl5 {
    public int getDigit (int num)
    {
        if (num < 10)
            return num;
        else
            return (num%10)+getDigit(num/10);
    }
    public static void main(String[] args) {

        Exmpl5 a = new Exmpl5();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("Sum = " + a.getDigit(num));

    }
}
