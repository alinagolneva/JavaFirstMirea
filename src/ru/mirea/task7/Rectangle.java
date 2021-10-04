package ru.mirea.task7;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled) {};

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return ("Rectangle: "+this.color+" (color), width is "+this.width+", length is "+this.length);
    }

    public double getArea() {
       return this.width*this.length;
    }
    public double getPerimeter() {
        return this.length+this.length+this.width+this.width;
    }
}
