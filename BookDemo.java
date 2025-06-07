// Base class
class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Derived class 1
class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

// Derived class 2
class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

// Derived class 3
class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("The Alchemist", "Paulo Coelho");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Java Programming", "James Gosling");

        System.out.println("Fiction Book Details:");
        fb.displayDetails();

        System.out.println("\nNon-Fiction Book Details:");
        nfb.displayDetails();

        System.out.println("\nTechnical Book Details:");
        tb.displayDetails();
    }
}
