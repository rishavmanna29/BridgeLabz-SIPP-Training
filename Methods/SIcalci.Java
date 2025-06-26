import java.util.*;
class Main {
    public static void SimpleInterest(float p,float r,float t){
        double si = (p*r*t)/100;
        
        System.out.print("the simple interest calculated for the values entered is: " + si);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the principal amount: ");
        float principal = input.nextFloat();
        
        System.out.print("enter the interest rate: ");
        float rate = input.nextFloat();
        
        System.out.print("enter the time period (in years) : ");
        float time = input.nextFloat();
        
        
        
        SimpleInterest(principal,rate,time);
        
        
    }
}