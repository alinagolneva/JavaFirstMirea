package ru.mirea.task12;

public class Student {

    public int id;
    public double gpa;
    public Student (int id, double gpa)
    {
        this.id = id;
        this.gpa=gpa;
    }

    public double getGPA() {
        return gpa;
    }

}
