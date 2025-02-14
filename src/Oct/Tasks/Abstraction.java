package Oct.Tasks;

public class Abstraction {
    public static void main(String[] args) {
        PrintMyBook pb = new PrintMyBook("Harry Potter","J.K.Rowling",120);
        pb.getDetails();
    }
}

abstract class Book {
    public String name;
    public String author;
    public int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}

class PrintMyBook extends Book{

    PrintMyBook(String name,String author,int price){
        super(name,author,price);
    }
    @Override
    void getDetails() {
        System.out.println(name + author + price);
    }
}
