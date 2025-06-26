import java.util.*;
class TempConv{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter temperature in Celsius: ");
    float number = sc.nextFloat();

    float temperature = (number * 9/5) + 32;
    
    System.out.print("Converted temperature (in Celsius): " + temperature);

  }

}