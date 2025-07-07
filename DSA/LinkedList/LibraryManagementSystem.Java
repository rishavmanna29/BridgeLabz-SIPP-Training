import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    Book head = null, tail = null;

    // Add at beginning
    public void addAtBeginning(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add at end
    public void addAtEnd(Book newBook) {
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(Book newBook, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newBook);
            return;
        }

        Book temp = head;
        int i = 1;
        while (i < position - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        if (temp.next == null) {
            addAtEnd(newBook);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            temp.next.prev = newBook;
            temp.next = newBook;
        }
    }

    // Remove by Book ID
    public void removeById(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        if (head.bookId == bookId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.println("Book removed.");
            return;
        }

        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
        } else {
            if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            System.out.println("Book removed.");
        }
    }

    // Search by title or author
    public void search(int key, String keyword) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if ((key == 1 && temp.title.equalsIgnoreCase(keyword)) ||
                (key == 2 && temp.author.equalsIgnoreCase(keyword))) {
                System.out.println("Found -> ID: " + temp.bookId + ", Title: " + temp.title +
                        ", Author: " + temp.author + ", Genre: " + temp.genre +
                        ", Available: " + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book not found.");
    }

    // Update availability
    public void updateAvailability(int bookId, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = head;
        System.out.println("\n--- Library Books (Forward) ---");
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = tail;
        System.out.println("\n--- Library Books (Reverse) ---");
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books: " + count);
    }

    private void printBook(Book b) {
        System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n---- Library Management ----");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book (1-Title / 2-Author)");
            System.out.println("6. Update Availability Status");
            System.out.println("7. Display All (Forward)");
            System.out.println("8. Display All (Reverse)");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean avail = sc.nextBoolean();

                    Book book = new Book(title, author, genre, id, avail);

                    if (choice == 1) lib.addAtBeginning(book);
                    else if (choice == 2) lib.addAtEnd(book);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        lib.addAtPosition(book, pos);
                    }
                }
                case 4 -> {
                    System.out.print("Enter Book ID to Remove: ");
                    int id = sc.nextInt();
                    lib.removeById(id);
                }
                case 5 -> {
                    System.out.print("Search by (1-Title / 2-Author): ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String key = sc.nextLine();
                    lib.search(type, key);
                }
                case 6 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Availability (true/false): ");
                    boolean avail = sc.nextBoolean();
                    lib.updateAvailability(id, avail);
                }
                case 7 -> lib.displayForward();
                case 8 -> lib.displayReverse();
                case 9 -> lib.countBooks();
                case 10 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
