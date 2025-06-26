import java.util.*;

class SimpleInterest{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter principle amount: ");
    float principle = sc.nextFloat();

    System.out.print("enter rate of interest: ");
    float rate = sc.nextFloat();
    

    System.out.print("enter time period (in years): ");
    int year = sc.nextInt();
    

    float formula = (principle * rate * year)/100;
    
    System.out.print("Simple interest calculated: " + formula );

  }

}