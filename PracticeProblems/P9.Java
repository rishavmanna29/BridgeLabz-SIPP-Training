import java.util.*;

class Avg{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter the three numbers (space separated): ");
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

    double formula = (a+b+c)/3.0;
    
    System.out.print("Average of the three numbers: " + formula );

  }

}