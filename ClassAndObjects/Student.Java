import java.util.*;
class Student{
    private String name;
    private int rollNumber;
    private float marks;
    
    public Student(String name,int rollNumber,float marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }

    public float getMarks() {
        return marks;
    }
    
    public String calculateGrade(int rollNumber,float marks){
        if(marks>=90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "E";
    }
    
    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}
    
    

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of students: ");
        int n = input.nextInt();
        
        
        Student[] student = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("enter details for student " + (i+1));
            
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Roll Number: ");
            int roll = input.nextInt();

            System.out.print("Marks: ");
            float marks = input.nextFloat();
            input.nextLine(); 
            
            student[i] = new Student(name,roll,marks);
            
        }
        
        for (int i = 0; i < n; i++) {
            if (students[i].getRollNumber() == searchRoll) {
                System.out.println("\nStudent Found:");
                students[i].display();  // show details and grade
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + searchRoll + " not found.");
        }
    }
}
        

        
        
        
        
        


}