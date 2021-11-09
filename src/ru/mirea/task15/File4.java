package ru.mirea.task15;

import java.io.*;
public class File4
{
    public static void main(String[] args) throws IOException {

        File file = new File("Example4.txt");

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file,true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String lineFromInput = in.readLine();
        // Запись содержимого в файл
        writer.write(lineFromInput);
        writer.flush();
        writer.close();


    }
}
