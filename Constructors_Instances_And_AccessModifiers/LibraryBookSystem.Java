import java.util.*;

public class LibraryBookSystem {
    private String title;
    private String author;
    private float price;
    private boolean isAvailable;
    private int bookCount;

    // Default constructor
    LibraryBookSystem() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0f;
        isAvailable = false;
        bookCount = 0;
    }

    // Parameterized constructor with count
    public LibraryBookSystem(String title, String author, float price, int count) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCount = count;
        this.isAvailable = count > 0;
    }

    // Returns "YES"/"NO" based on availability
    public String isAvailable() {
        return isAvailable ? "YES" : "NO";
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Availability: " + isAvailable());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books you want: ");
        int n = input.nextInt();
        input.nextLine(); // clear the buffer

        LibraryBookSystem[] book = new LibraryBookSystem[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the details for book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title1 = input.nextLine().trim();

            System.out.print("Author: ");
            String author1 = input.nextLine().trim();

            System.out.print("Price: ");
            float price1 = input.nextFloat();

            System.out.print("Count: ");
            int count = input.nextInt();
            input.nextLine(); // clear buffer

            book[i] = new LibraryBookSystem(title1, author1, price1, count);
        }

        System.out.println("\n--- Book Information ---");
        for (LibraryBookSystem b : book) {
            b.displayDetails();
            System.out.println("---------------------------");
        }

        input.close();
    }
}
