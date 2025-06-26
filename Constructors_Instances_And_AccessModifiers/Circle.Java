import java.util.Scanner;

public class Circle {
    private double radius;

    // Default constructor (uses constructor chaining)
    public Circle() {
        this(1.0); // Default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayCircleInfo() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area  : %.2f\n", calculateArea());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking radius input
        System.out.print("Enter radius of the circle: ");
        double userRadius = scanner.nextDouble();

        // Create circle objects
        Circle defaultCircle = new Circle();
        Circle userCircle = new Circle(userRadius);

        System.out.println("\n=== Default Circle Info ===");
        defaultCircle.displayCircleInfo();

        System.out.println("\n=== User Provided Circle Info ===");
        userCircle.displayCircleInfo();

        scanner.close();
    }
}
