package ru.mirea.task10;

public class Exmpl10 {
    public void getDigit (int n)
    {
        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            System.out.print(n % 10);
            getDigit(n / 10);
        }
    }
    public static void main(String[] args) {
        Exmpl10 a = new Exmpl10();
        a.getDigit(123456);

    }
}
