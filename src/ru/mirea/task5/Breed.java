package ru.mirea.task5;

public class Breed extends Dog {
    private String breedDog;
    public Breed(String n, int w, String b) {
        super("Liza",20);
        breedDog=b;
    }
    public void setBreed(String breedDog) {
        this.breedDog = breedDog;
    }
    public String getBreed()
    {
        return breedDog;
    }
    public String toString()
    {
        return getName()+", weight "+getWeight()+" , breed "+getBreed();
    }

}
