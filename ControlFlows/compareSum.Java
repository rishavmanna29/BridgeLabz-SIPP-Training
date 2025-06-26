

import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        
        int number = input.nextInt();
        int formula = (number*(number+1))/2;
        int counter = 0;
        int i = 1;
        while(i<=number){
            counter+=i;
            i++;
        }
        System.out.print("the sum of the numbers is: " + counter);
        
        if(counter==formula){
            System.out.println("\nthe sums from both the methods are equal");
        }
        
        else{
            System.out.println("\nthe sums from both the methods are not equal");
        }
        
       
        input.close();
  }

}