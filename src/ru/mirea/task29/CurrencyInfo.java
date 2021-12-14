package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private String info;

    public CurrencyInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}