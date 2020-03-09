package Encapsulation;

// Abstarct Book Class
abstract class Book {

    // Protected Fields
    protected String name;
    protected String author;
    protected String price;

    // Parameterized Constructor
    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Abstract Method
    public abstract String getDetails();

}

// Class MyBook extending Book Class
class MyBook extends Book {

    // Parameterized Constructor
    public MyBook(String name, String author, String price) {
        super(name, author, price);
    }

    // Overrideing the getDetails Abstrat Method of the Base Class
    public String getDetails() {
        System.out.println("Inside the getDetails");
        return this.author + this.name + this.price;
    }

}

interface Addition{
    int add(int num1, int num2);
}

class Calculator implements Addition{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Book book = new MyBook("Harry Potter","J.K Rowling","5000");
        String required = book.getDetails();
        System.out.println(required);
    }
}
