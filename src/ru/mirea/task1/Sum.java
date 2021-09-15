package ru.mirea.task1;

public class Sum
{
    private double[] arr= new double[5];
    private double sumFor=0;
    private double sumWhile=0;
    private double sumDoWhile=0;
    private int step=0;
    public Sum()
    {
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }
    }
    public void sumArrFor()
    {
        for(int i=0; i<5; i++)
        {
            sumFor=sumFor+arr[i];
        }
    }

    public void sumArrWhile()
    {
        while (step!=5)
        {
            sumWhile=sumWhile+arr[step];
            step++;
        }
        step=0;
    }

    public void sumArrDoWhile()
    {
        do {
            sumDoWhile=sumDoWhile+arr[step];
            step++;
        } while(step!=5);
    }

    public void getSum()
    {
        System.out.println("Sum with cycle for is "+sumFor+", Sum with cycle while is "+sumWhile+ ", Sum with cycle do while is "+sumDoWhile);
    }
}
