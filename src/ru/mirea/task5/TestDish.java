package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        TypesDish t1 = new TypesDish("gzhel","blue", "pot" );
        System.out.println(t1.getDesign());
        t1.setTypesDish("colander");
        System.out.println(t1.toString()+", type is "+t1.getInform());
}
}
