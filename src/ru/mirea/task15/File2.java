package ru.mirea.task15;

import java.io.*;
public class File2 {
    public static void main(String[] args) throws IOException{

        FileReader reader = new FileReader("Example2.txt");
        int c;
        while((c=reader.read())!=-1){

            System.out.print((char)c);
        }


    }
}
