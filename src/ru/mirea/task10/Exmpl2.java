package ru.mirea.task10;

import java.util.Scanner;

public class Exmpl2 {
    public String getDigit (int num)
    {
        if (num==1)
            return "1";
        return getDigit(num-1) + " " + num;
    }
    public static void main(String[] args) {
        Exmpl2 a = new Exmpl2();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(a.getDigit(num));
    }
}
