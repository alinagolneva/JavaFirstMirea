package Book;

public class Book {
    private String name;
    private String writer;
    private int price;
    public Book(String n, String w, int p){
        name = n;
        writer = w;
        price = p;
    }
    public Book(String n){
        name = n;
        writer = "";
        price = 10;
    }
    public Book() {
        name="War and peace";
        writer="Leo Tolstoy";
        price = 0;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public String getName(String name){
        return name;
    }
    public String getWriter(String writer){
        return writer;
    }
    public void intoNameWriterPrice(){
        System.out.println(name+"is a book written by the author "+writer+" and the price of this book is "+price);
    }
}
