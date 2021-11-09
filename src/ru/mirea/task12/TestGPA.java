package ru.mirea.task12;

public class TestGPA {


    public static void main(String[] args) {
        Student[] iDNumber = new Student[4];
        iDNumber[0] = new Student(687490300, 2.3);
        iDNumber[1] = new Student(345098578, 4.6);
        iDNumber[2] = new Student(545098578, 3.5);
        iDNumber[3] = new Student(845098578, 8.1);

        SortingStudentsByGPA.quickSort(iDNumber, 0, iDNumber.length - 1);
        for(int i = 0; i < iDNumber.length; i++)
            System.out.println(" " + iDNumber[i].gpa);
    }
}
