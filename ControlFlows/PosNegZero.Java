

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        
        
        if(number>0){
            System.out.print("number entered is a positive one");
        }
        else if(number<0 && number<0){
            System.out.print("number entered is a negative one");
        }
        else{
            System.out.print("number entered is zero");
        }
        input.close();
    }
}
    