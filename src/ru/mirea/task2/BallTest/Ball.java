package ru.mirea.task2.BallTest;

public class Ball {
    private String color;
    private int weight;
    public Ball(String c, int w){
        color = c;
        weight = w;
    }
    public Ball(String c){
        color = c;
        weight = 0;
    }
    public Ball(){
        color = "red";
        weight = 0;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getWeight() {
        return weight;
    }
    public String toString(){
        return this.color+", weight "+this.weight;
    }
    public void getInform(){
        System.out.println(color+" is a color of this ball and weight is "+weight+".");
    }
}
