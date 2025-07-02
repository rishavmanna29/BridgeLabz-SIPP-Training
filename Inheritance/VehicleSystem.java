import java.util.*;

class Vehicle {
    private float maxSpeed;
    private String fuelType;

    public Vehicle(float maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("The details of the vehicle are as follows: ");

        System.out.println("max speed: " + maxSpeed);
        System.out.println("fuel type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(float maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("seat capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int numberOfTyres;

    public Truck(float maxSpeed, String fuelType, int numberOfTyres) {
        super(maxSpeed, fuelType);
        this.numberOfTyres = numberOfTyres;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("number of tyres in the truck: " + numberOfTyres);
    }
}

class Bike extends Vehicle {
    private String EngineType;

    public Bike(float maxSpeed, String fuelType, String EngineType) {
        super(maxSpeed, fuelType);
        this.EngineType = EngineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike engine type: " + EngineType);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of vehicles you want: ");

        int n = input.nextInt();
        input.nextLine(); // consume leftover newline

        Vehicle[] vh = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the vehicle details for vehicle " + (i + 1) + " " + " :");

            System.out.println("enter the max speed for the vehicle: ");
            float maxSpeed1 = input.nextFloat();
            input.nextLine(); // consume newline

            System.out.println("enter the fuel type (either diesel or petrol) for the vehicle: ");
            String fuelType1 = input.nextLine();

            System.out.println("enter the type of vehicle: ");
            String typeVehicle = input.nextLine().toLowerCase();

            if (typeVehicle.equals("car")) {
                System.out.print("enter the seat capacity for the car: ");
                int seatCapacity1 = input.nextInt();
                input.nextLine(); // consume newline
                vh[i] = new Car(maxSpeed1, fuelType1, seatCapacity1);
            } 
            else if (typeVehicle.equals("truck")) {
                System.out.println("enter the number of tyres in the truck: ");
                int numberOfTyres1 = input.nextInt();
                input.nextLine(); // consume newline
                vh[i] = new Truck(maxSpeed1, fuelType1, numberOfTyres1);
            } 
            else if (typeVehicle.equals("bike")) {
                System.out.println("enter the bike's engine type: ");
                String EngineType1 = input.nextLine();
                vh[i] = new Bike(maxSpeed1, fuelType1, EngineType1);
            } 
            else {
                System.out.println("you have entered an invalid vehicle type. Displaying generic vehicle properties: ");
                vh[i] = new Vehicle(maxSpeed1, fuelType1);
            }
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vh)    //acts like for v variable of datatype Vehicle is in the array vh
        {
            v.displayInfo(); // polymorphism in action
            System.out.println();
        }

        input.close();
    }
}
