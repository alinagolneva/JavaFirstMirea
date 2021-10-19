package ru.mirea.task10;

import java.util.Scanner;

public class Exmpl3 {
    public String getDigit (int n, int k)
    {
        if (k==n)
            return "";
        return getDigit(n, k-1) + " " + k;
    }
    public static void main(String[] args) {
        Exmpl3 a = new Exmpl3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(n + a.getDigit(n,k));
    }
}
