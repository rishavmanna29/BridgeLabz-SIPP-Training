import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int number = input.nextInt();
        
        System.out.print("enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("enter the third number: ");
        int number3 = input.nextInt();
        
        
        if(number<number2 && number<number3){
             
            System.out.println("first number is the smallest of the three numbers");
        }

        else{
           System.out.println("first number is not the smallest of the three numbers");
        }
        input.close();
  }

}