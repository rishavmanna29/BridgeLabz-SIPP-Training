import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + ", " + name + ", " + dept + ", " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", "HR", 50000),
            new Employee(102, "Bob", "IT", 70000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> loaded = (List<Employee>) ois.readObject();
            System.out.println("Deserialized employees:");
            for (Employee e : loaded) System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
