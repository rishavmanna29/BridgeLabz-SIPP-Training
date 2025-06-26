import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        
        int number = input.nextInt();
        int counter = 1;
        int factorial = 1;
        while(counter<=number){
            factorial*=counter;
            counter++;
        }
        System.out.println("factorial of the given number is: " + factorial);
       
        input.close();
  }

}