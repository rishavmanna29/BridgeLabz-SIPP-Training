import java.util.*;
class Solution{

   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter day (as an integer): ");
        
        int day = input.nextInt();
         
        System.out.print("enter Month (as an integer): ");
        
        int month = input.nextInt();
        
        boolean spring = 
            (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);

        if (spring){
            System.out.println("It's a Spring Season");
        } 
        
        else{
            System.out.println("Not a Spring Season");
        }
        
        
       
        input.close();
  }

}