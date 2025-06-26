/*
 * Program: Display Employee Details
 * Purpose: To demonstrate object-oriented programming concepts such as encapsulation,
 *          constructors, and proper naming conventions using a real-world example.
 */

public class Employee {

    /*
     * Private fields to store employee details.
     * These fields are encapsulated to restrict direct access from outside the class.
     */
    private String name;
    private int id;
    private double salary;

    /*
     * Constructor: Initializes the Employee object with the given name, id, and salary.
     * This ensures that all objects are created with valid data.
     */
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /*
     * Getter method for 'name'.
     * Allows read-only access to the 'name' field from outside the class.
     */
    public String getName() {
        return name;
    }

    /*
     * Setter method for 'name'.
     * Allows controlled modification of the 'name' field.
     */
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for 'salary'
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
     * Method: displayDetails
     * Purpose: Prints the employee's details to the console in a readable format.
     */
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }

    /*
     * Main method: Acts as the entry point of the program.
     * Creates an Employee object and displays the details using the displayDetails method.
     */
    public static void main(String[] args) {
        // Creating an Employee object with sample data
        Employee emp = new Employee("John Doe", 101, 50000.0);

        // Displaying the employee's information
        emp.displayDetails();
    }
}
