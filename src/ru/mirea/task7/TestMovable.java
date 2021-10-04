package ru.mirea.task7;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint t1= new MovablePoint(1,2,3,4);
        MovablePoint t2 = new MovablePoint(5,6,7,8);
        MovableCircle c1 = new MovableCircle(2,3,4,5,3);
        MovableRectangle r1 = new MovableRectangle(6,5,4,3,2,3);

        t1.moveDown();
        t2.moveUp();
        c1.moveRight();
        r1.moveLeft();

        System.out.println("t1: "+t1+ ", t2: "+t2+", c1: "+c1+", r1: "+r1);
    }
}
