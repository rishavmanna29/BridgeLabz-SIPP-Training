class Employee {

    String name;
    String id;
    float salary;

    public Employee(String name, String id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("The employee details are as follows:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, String id, float salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String id, float salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String internSchool;

    public Intern(String name, String id, float salary, String internSchool) {
        super(name, id, salary);
        this.internSchool = internSchool;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Intern School: " + internSchool);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {

        
        Employee emp1 = new Manager("Alice", "M101", 90000, 10);
        Employee emp2 = new Developer("Bob", "D102", 75000, "Java");
        Employee emp3 = new Intern("Charlie", "I103", 20000, "IIT Delhi");

        // All objects call their own overridden version
        emp1.displayEmployeeDetails();
        System.out.println("-----------------------");

        emp2.displayEmployeeDetails();
        System.out.println("-----------------------");

        emp3.displayEmployeeDetails();
    }
}
