package ru.mirea.task5;

public class TypesDish extends Dish
{
    private String typesDish;
    public TypesDish(String d, String c, String t)
    {
        super("Gzhel","white");
        typesDish=t;
    }
    public void setTypesDish(String typesDish) {
        this.typesDish = typesDish;
    }
    public String getInform() {return typesDish;}
}
