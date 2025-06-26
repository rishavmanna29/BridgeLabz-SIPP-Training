import java.util.*;
public class Person{
    private String name;
    private String gender;
    private float height;
    private float weight;
// i made a default constructor for better code implementation    
    Person(){
        
        name = "Unknown";
        gender = "Unknown";
        height = 0.0f;
        weight = 0.0f;
        
    }
    public Person(String name,String gender,float height,float weight){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight =weight;
        
    }
    //copy constructor (to reuse the an object with the exact same values)
    public Person(Person copy){
        this.name = copy.othername;
        this.gender = copy.gender;
        this.height = copy.height;
        this.weight =copy.weight;
        
    }
    
    public void displayDetails(){
        System.out.println("Person's Characteristics: ");
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("height: " + height);
         System.out.println("weight: " + weight);
    }
    
    
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the number of persons you want to enter: ");
        int n = input.nextInt();
        
        
        
        Person[] person = new Person[n];
        
        for(int i = 0;i<n;i++){
            System.out.print("enter the details for Person " + (i+1) " : ");
            
            
            System.out.print("enter the person's name: ");
            String name1 = input.nextLine().trim();
            
            System.out.print("enter the person's gender: ");
            String gender1 = input.nextLine().trim();
            
            System.out.print("enter the person's height: ");
            float height1 = input.nextFloat();
            
            System.out.print("enter the person's weight: ");
            float weight1 = input.nextFloat();
            
            
            person[i] = new Person(name1.gender1,height1,weight1);
        }
        
        System.out.println("\nYou entered these persons:");
        for(Person b : person){
            b.displayDetails();
        }

        if (n > 0){
            System.out.println("Copying first person's details using copy constructor...");
            Person copy = new Person(person[0]);
            person.displayBookingDetails();
        }
        
        
        
        
    }
}