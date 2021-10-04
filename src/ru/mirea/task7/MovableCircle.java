package ru.mirea.task7;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
    }

    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp() {
       center.y +=center.ySpeed;
    }
    public void moveDown() {
        center.y -=center.ySpeed;
    }
    public void moveLeft() {
        center.x -=center.xSpeed;
    }
    public void moveRight() {
        center.x +=center.xSpeed;
    }
}
