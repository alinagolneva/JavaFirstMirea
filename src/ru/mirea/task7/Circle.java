package ru.mirea.task7;

public class Circle extends Shape
{
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "Yellow";
        radius = 1;
    };
    public Circle(double radius)
    {
        this.filled = false;
        this.color = "Red";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        return ("Circle: "+this.color+" radius is "+this.radius+", filled is "+this.filled);
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
