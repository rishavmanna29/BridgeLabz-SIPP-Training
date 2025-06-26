import java.util.*;
class Main {
    
 
    
    public static void DistanceCalculator(float a,float b,float c, float d){
        double perimeter = a + b + c;
        double rounds = perimeter/d;
        System.out.print("the number of rounds the guy needs to run to cover " + d + " km" + " " + " is " + rounds + " km");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the first side of the triangle: ");
        float side1 = input.nextFloat();
        
        System.out.print("enter the second side of the triangle: ");
        float side2 = input.nextFloat();
        
        System.out.print("enter the third side of the triangle: ");
        float side3 = input.nextFloat();
        
        System.out.print("enter the total distance to be covered: ");
        float distance = input.nextFloat();
        
        DistanceCalculator(side1,side2,side3,distance);
        
        
    }
}