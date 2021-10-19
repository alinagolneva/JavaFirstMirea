package ru.mirea.task10;
public class Exmpl14 {
    public void getDigit (int n)
    {
        if (n < 10)
            System.out.println(n);
        else
        {
            getDigit(n/10);
            System.out.println(n%10);
        }
    }
    public static void main(String[] args) {
        Exmpl14 a = new Exmpl14();
        a.getDigit(123456);

    }
}