package ru.mirea.task12;

public class TestMerge {


    public static void main(String[] args) {
        Student[] iDNumber = new Student[3];
        iDNumber[0] = new Student(687490300, 2.3);
        iDNumber[1] = new Student(345098578, 4.6);
        iDNumber[2] = new Student(545098578, 3.5);

        Student[] student = new Student[2];
        student[0]= new Student(478954323,10.0);
        student[1]= new Student(978954323,9.5);

        Student[] tghr = new Student[5];
        tghr[0]=iDNumber[0];
        tghr[1]=iDNumber[1];
        tghr[2]=iDNumber[2];
        tghr[3]=student[0];
        tghr[4]=student[1];


        Merge.mergeSort(tghr,0,4);
        for(int i = 0; i < tghr.length; i++)
            System.out.println(" " + tghr[i].id);
    }
}
