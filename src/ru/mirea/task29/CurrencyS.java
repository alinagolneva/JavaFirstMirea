package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CurrencyS {
    public static void main(String[] args) throws IOException {
        CurrencyC currencyC = new CurrencyC("USD: 73.4, EUR 82.9");
        CurrencyInfo currencyInfo = new CurrencyInfo("Information about currency.");
        SavedCurrency savedCurrency = new SavedCurrency(currencyInfo, currencyC);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Alina\\Desktop\\savedCurrency.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(savedCurrency);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}