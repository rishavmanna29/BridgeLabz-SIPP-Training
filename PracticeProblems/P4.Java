import java.util.*;
import static java.lang.Math.PI;
class Solution{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter radius: ");
    float radius = sc.nextFloat();
    double intermediate = Math.pow(radius, 2);
    double Area = PI * intermediate;
    
    System.out.print("Area of circle is: " + Area);

  }

}