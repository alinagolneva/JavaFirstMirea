package ru.mirea.task4;

public class TestAuthor
{
    public static void main(String[] args) {
        Author a1 = new Author("Ivanova", "ivanovaa@gmail.com", 'F');
        System.out.println(a1.toString());
        a1.getEmail();
    }
}
