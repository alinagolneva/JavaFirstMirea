package ru.mirea.task29;

public class CurrencyC {
    private String info;

    public CurrencyC(String info) {
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
        return "CurrencyC{" +
                "info='" + info + '\'' +
                '}';
    }
}
