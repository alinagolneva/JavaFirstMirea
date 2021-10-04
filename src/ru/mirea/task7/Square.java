package ru.mirea.task7;

public class Square extends Rectangle
{
    private double side;
    public Square() {
        width = 2;
        length = 2;
        color = "Black";
        filled = false;
    };

    public  Square (double side)
    {
        this.width = side;
        this.length = side;
        color = "White";
        filled = false;
    };

    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth (double side)
    {
        this.width=side;
        this.length = side;
    }
    public void setLength (double side)
    {
        this.width=side;
        this.length = side;
    }
    public String toString(){
        return("Square: "+"Width: "+width+", length: "+length+", color: "+color+", filled: "+filled);
    }

}
