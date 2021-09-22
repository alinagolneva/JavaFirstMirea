package ru.mirea.task6;

public class TestNameable implements Nameable
{
    public String getName(String name)
    {
        return name;
    }
    public static void main(String[] args)
    {
        TestNameable human = new TestNameable();
        System.out.println(human.getName("Elena"));
        TestNameable dog = new TestNameable();
        System.out.println(dog.getName("Sharik"));
        TestNameable car = new TestNameable();
        System.out.println(car.getName("BMW"));
    }
}
