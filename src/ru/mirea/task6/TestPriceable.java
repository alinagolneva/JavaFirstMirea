package ru.mirea.task6;

public class TestPriceable implements Priceable
{
    public int getPrice(int price)
    {
        return price;
    }
    public static void main(String[] args)
    {
       PriceCar c1 = new PriceCar();
       PriceHouse h1 = new PriceHouse();
       System.out.println("Price car is "+c1.getPrice(3000000));
       System.out.println("Price house is "+c1.getPrice(15000000));
    }
}
