import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        HotelBooking[] bookings = new HotelBooking[n];

        // Take input for each booking
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for booking " + (i + 1) + ":");

            System.out.print("Guest Name: ");
            String name = sc.nextLine();

            System.out.print("Room Type: ");
            String roomType = sc.nextLine();

            System.out.print("Number of Nights: ");
            int nights = sc.nextInt();
            sc.nextLine(); // clear buffer

            bookings[i] = new HotelBooking(name, roomType, nights);
        }

        System.out.println("\n--- Booking Details ---");
        for (HotelBooking b : bookings) {
            b.displayBookingDetails();
        }

        // Demonstrate copy constructor using the first booking
        if (n > 0) {
            System.out.println("Copying first booking using copy constructor...");
            HotelBooking copy = new HotelBooking(bookings[0]);
            copy.displayBookingDetails();
        }

        sc.close();
    }
}
