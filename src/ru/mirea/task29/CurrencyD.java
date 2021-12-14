package ru.mirea.task29;

import java.io.*;

public class CurrencyD {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Alina\\Desktop\\savedCurrency.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SavedCurrency savedCurrency = (SavedCurrency) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(savedCurrency);
    }
}
