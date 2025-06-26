

import java.util.*;
class Solution{

   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        
        int number = input.nextInt();

        int sum = 0;
        int counter = 1;
        
        
        
        while(counter<=number){
            if(number<0||number==0) {
                break;
            }
            sum+=counter;
            counter++;
        }
        System.out.print("the sum of the numbers is: " + sum);
        
        
        
       
        input.close();
  }

}