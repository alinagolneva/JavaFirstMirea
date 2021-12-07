package ru.mirea.task25;

public class OptionDecorator implements Menuu{
    private Menuu menu;
    private String label;
    private double score;

    public OptionDecorator(Menuu menu, String label, double score) {
        this.menu = menu;
        this.label = label;
        this.score = score;
    }
    public double getScore() {
        return this.score + menu.getScore();
    }

    public String getLabel() {
        return this.label + menu.getLabel();
    }
}
