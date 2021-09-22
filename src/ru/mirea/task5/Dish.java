package ru.mirea.task5;

public class Dish {
    private String design;
    private String color;

    public Dish(String d, String c) {
        design = d;
        color = c;
    }

    public String getDesign() {
        return design;
    }
    public String getColor()
    {
        return color;
    }
    public String toString(){
        return "Design is "+ this.design+", color "+this.color;
    }
}