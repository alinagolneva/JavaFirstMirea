package ru.mirea.task2.BallTest;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("red", 2);
        Ball b2 = new Ball("green", 1);
        Ball b3 = new Ball("yellow");
        b3.setWeight(3);
        System.out.println(b1);
        b1.getInform();
        b2.getInform();
        b3.getInform();
    }
}
