import java.util.*;
class Solution{

   public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the value for the counter: ");
        int counter = input.nextInt();
        
        for(int i=counter;i>0;i--){
            System.out.println("counter: " + (i));
        }
        
       
        input.close();
  }

}