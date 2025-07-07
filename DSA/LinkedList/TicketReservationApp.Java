import java.util.Scanner;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketSystem {
    private Ticket last = null;

    // Add ticket at the end (maintains circular structure)
    public void addTicket(Ticket newTicket) {
        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        System.out.println("Ticket booked successfully.");
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = last.next;
        Ticket prev = last;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("Ticket ID not found.");
            return;
        }

        if (current == last && current == last.next) { // only one node
            last = null;
        } else {
            prev.next = current.next;
            if (current == last)
                last = prev;
        }

        System.out.println("Ticket removed.");
    }

    // Display all tickets
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = last.next;
        System.out.println("\n--- Ticket List ---");
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName
                    + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    // Search by customer name or movie name
    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = last.next;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found Ticket -> ID: " + temp.ticketId + ", Movie: " + temp.movieName + ", Customer: "
                        + temp.customerName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != last.next);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    // Count total tickets
    public void countTickets() {
        if (last == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = last.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != last.next);

        System.out.println("Total Tickets Booked: " + count);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem system = new TicketSystem();

        while (true) {
            System.out.println("\n--- Online Ticket Reservation System ---");
            System.out.println("1. Add Ticket");
            System.out.println("2. Remove Ticket by ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket by Customer or Movie Name");
            System.out.println("5. Count Total Tickets");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Enter Seat Number: ");
                    String seat = sc.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String time = sc.nextLine();
                    Ticket ticket = new Ticket(id, customer, movie, seat, time);
                    system.addTicket(ticket);
                }
                case 2 -> {
                    System.out.print("Enter Ticket ID to Remove: ");
                    system.removeTicket(sc.nextInt());
                }
                case 3 -> system.displayTickets();
                case 4 -> {
                    System.out.print("Enter Customer Name or Movie Name: ");
                    String keyword = sc.nextLine();
                    system.searchTicket(keyword);
                }
                case 5 -> system.countTickets();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
