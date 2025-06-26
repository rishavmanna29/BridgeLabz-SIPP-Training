import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        if(number%10 == 0 || number%10==5){
             
            System.out.println("number is divisible by 5");
        }

        else{
           System.out.println("number is not divisible by 5");
        }
        input.close();
  }

}