import java.util.*;
class Main {
    public static void MaxHandshakes(int s){
        int maxhandshakes = (s*(s-1))/2;
        
        System.out.print("maximum possible handshakes for the given number of students is: " + maxhandshakes);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the number of students in the class:  ");
        int students = input.nextInt();
        
        MaxHandshakes(students);
        
        
    }
}