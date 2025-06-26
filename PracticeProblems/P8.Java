import java.util.*;

class Exponential{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter base: ");
    int base = sc.nextInt();

    System.out.print("enter exponent: ");
    int exponent= sc.nextInt();
    

    double formula = Math.pow(base,exponent);
    
    System.out.print("power: " + formula );

  }

}