
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        
        int[] arr = new int[10];
        
        for(int i = 0;i<arr.length;i++){
            
            arr[i] = number*(i+1);
        }
        
        System.out.println("multiplication table of" + number + " is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(number + "*" + i + " =" + arr[i]);
        }
        
        input.close();
    }
}