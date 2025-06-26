import java.util.*;

class Rectangle{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("enter length of rectangle: ");
    int length = sc.nextInt();

    System.out.print("enter breadth of rectangle: ");
    int breadth= sc.nextInt();
    

    int formula = 2 * (length + breadth);
    
    System.out.print("perimeter calculated: " + formula );

  }

}