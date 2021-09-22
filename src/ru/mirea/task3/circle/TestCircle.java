package ru.mirea.task3.circle;

public class TestCircle {
    public static void main(String[] ars){
        Circle cir = new Circle(0);
        cir.setRadius(12);
        System.out.println("Radius = " + cir.getRadius());
        cir.getDiameter();
    }
}
