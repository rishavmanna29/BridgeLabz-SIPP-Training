
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter elements in the array: ");
        
        int[] array = new int[10];
        int sum = 0;
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
            if(array[i]<=0){
                break;
            }
            else{
                continue;
            }
            
        }
        
        System.out.println("elements of the array are: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        
         
        for(int i=0;i<array.length;i++){
            sum+=array[i];

        }
        System.out.println("the sum of the elements in the array is: " + sum);
        
        
        
        
        input.close();
    }
}