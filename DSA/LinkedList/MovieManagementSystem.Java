import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieList {
    Movie head = null, tail = null;

    public void addAtBeginning(Movie newMovie) {
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addAtEnd(Movie newMovie) {
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addAtPosition(Movie newMovie, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(newMovie);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newMovie.next = temp.next;
        newMovie.prev = temp;

        if (temp.next != null) temp.next.prev = newMovie;
        else tail = newMovie;

        temp.next = newMovie;
    }

    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Movie temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
        } else {
            if (temp == head) head = temp.next;
            if (temp == tail) tail = temp.prev;

            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;

            System.out.println("Movie removed.");
        }
    }

    public void searchByDirectorOrRating(String director, double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No match found.");
    }

    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        Movie temp = head;
        if (temp == null) {
            System.out.println("No records.");
            return;
        }
        System.out.println("\nMovies (Forward):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Movie temp = tail;
        if (temp == null) {
            System.out.println("No records.");
            return;
        }
        System.out.println("\nMovies (Reverse):");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieList list = new MovieList();

        while (true) {
            System.out.println("\n--- Movie Management Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director or Rating");
            System.out.println("6. Update Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    Movie m = new Movie(title, director, year, rating);
                    if (ch == 1) list.addAtBeginning(m);
                    else if (ch == 2) list.addAtEnd(m);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(m, pos);
                    }
                }
                case 4 -> {
                    System.out.print("Enter Title to Remove: ");
                    String title = sc.nextLine();
                    list.removeByTitle(title);
                }
                case 5 -> {
                    System.out.print("Enter Director (or press Enter to skip): ");
                    String director = sc.nextLine();
                    System.out.print("Enter Rating (or -1 to skip): ");
                    double rating = sc.nextDouble();
                    list.searchByDirectorOrRating(director, rating);
                }
                case 6 -> {
                    System.out.print("Enter Title to Update: ");
                    String title = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double r = sc.nextDouble();
                    list.updateRating(title, r);
                }
                case 7 -> list.displayForward();
                case 8 -> list.displayReverse();
                case 9 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
