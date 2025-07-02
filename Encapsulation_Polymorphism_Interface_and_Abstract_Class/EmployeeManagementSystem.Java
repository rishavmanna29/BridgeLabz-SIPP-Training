import java.util.Scanner;

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }

    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee #" + (i + 1));
            System.out.print("Enter type (full/part): ");
            String type = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter base salary: ");
            double baseSalary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter department: ");
            String department = sc.nextLine();

            if (type.equalsIgnoreCase("full")) {
                System.out.print("Enter bonus: ");
                double bonus = sc.nextDouble();
                sc.nextLine();
                FullTimeEmployee fte = new FullTimeEmployee(id, name, baseSalary, bonus);
                fte.assignDepartment(department);
                employees[i] = fte;
            } else if (type.equalsIgnoreCase("part")) {
                System.out.print("Enter hours worked: ");
                int hours = sc.nextInt();
                System.out.print("Enter hourly rate: ");
                double rate = sc.nextDouble();
                sc.nextLine();
                PartTimeEmployee pte = new PartTimeEmployee(id, name, baseSalary, hours, rate);
                pte.assignDepartment(department);
                employees[i] = pte;
            } else {
                System.out.println("Invalid employee type. Skipping entry.");
                i--;
            }

            System.out.println();
        }

        System.out.println("Employee Details:");
        for (int i = 0; i < n; i++) {
            if (employees[i] != null) {
                employees[i].displayDetails();
                System.out.println();
            }
        }

        sc.close();
    }
}
