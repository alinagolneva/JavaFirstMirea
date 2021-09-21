package ru.mirea.task2.Book;


public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("The Idiot", "Dostoevsky", 500);
        Book b2 = new Book("Crime and punishment");
        Book b3 = new Book();
        b1.setPrice(120);
        b1.intoNameWriterPrice();
        b2.intoNameWriterPrice();
        b3.intoNameWriterPrice();
    }
}
