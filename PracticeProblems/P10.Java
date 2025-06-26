import java.util.*;

class MileConvert{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter distance (in kms): ");
    int a = sc.nextInt();

    double formula = a*0.621371;
    
    
    System.out.print("Distance (in miles) : " + formula );

  }

}