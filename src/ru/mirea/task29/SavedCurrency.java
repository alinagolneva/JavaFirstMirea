package ru.mirea.task29;

import java.io.Serializable;

public class SavedCurrency implements Serializable {
    private transient CurrencyInfo currencyInfo;
    private CurrencyC currencyC;

    public SavedCurrency(CurrencyInfo currencyInfo, CurrencyC currencyC) {
        this.currencyInfo = currencyInfo;
        this.currencyC = currencyC;
    }

    public CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public CurrencyC getCurrencyC() {
        return currencyC;
    }

    public void setCurrencyC(CurrencyC currencyC) {
        this.currencyC = currencyC;
    }

    @Override
    public String toString() {
        return "SavedCurrency{" +
                "CurrencyC" + currencyC +
                " CurrencyInfo=" + currencyInfo +
                '}';
    }
}