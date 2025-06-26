
import java.util.*;
class Main {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int number = input.nextInt();
           int sum = 0;
           int counter = 1;
           if(number>0){
               while(counter<=number){
                   sum+=counter;
                   counter++;
               }
            System.out.println("The sum of " + number + " natural numbers is " + sum);
           }
           
           else{
               System.out.print("number entered is not a whole number");
           }
           
           input.close();
           
    }
}