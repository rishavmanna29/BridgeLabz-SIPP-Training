import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for parameterized constructor
        System.out.print("Enter book title: ");
        String userTitle = scanner.nextLine();

        System.out.print("Enter author name: ");
        String userAuthor = scanner.nextLine();

        System.out.print("Enter book price: ");
        double userPrice = scanner.nextDouble();

        // Create book objects
        Book defaultBook = new Book();
        Book userBook = new Book(userTitle, userAuthor, userPrice);

        System.out.println("\n=== Default Book Details ===");
        defaultBook.displayBookDetails();

        System.out.println("\n=== User Provided Book Details ===");
        userBook.displayBookDetails();

        scanner.close();
    }
}
