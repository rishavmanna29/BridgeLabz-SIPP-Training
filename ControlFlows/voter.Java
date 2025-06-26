

import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        
        int age = input.nextInt();
        
        if(age>=18){
            System.out.println("person is eligible for voting");
        }
        
        else if(age<18 && age>0){
            System.out.println("person is ineligible for voting");
            
        }
        
        else if(age==0){
            System.out.println("Please enter an age greater than 0");
        }
        
       
        input.close();
  }

}