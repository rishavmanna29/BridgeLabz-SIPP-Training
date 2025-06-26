

import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("enter the third number: ");
        int number3 = input.nextInt();
        
        
        if(number1>number2 && number1>number3){
             
            System.out.println("first number is the largest of the three numbers");
        }

        else if(number2>number1 && number2>number3){
           System.out.println("second number is the largest of the three numbers");
        }
        
        else if(number3>number1 && number3>number2){
           System.out.println("third number is the largest of the three numbers");
        }
        //input.close();
  }

}