import java.util.*;
import static java.lang.Math.PI;
class Cylinder{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter radius of cylinder: ");
    float radius = sc.nextFloat();

    System.out.print("enter height of cylinder: ");
    double height = sc.nextDouble();
    

    double intermediate = Math.pow(radius, 2);
    double volume = PI * intermediate * height;
    
    System.out.print("Volume of cylinder is: " + volume);

  }

}