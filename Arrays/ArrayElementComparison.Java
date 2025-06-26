
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter elements in the array: ");
        
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i] + "is even");
                }
                else{
                    System.out.println(arr[i] + "is odd");
                }
                
            }
            
            else if(arr[i]<0){
                System.out.println(arr[i] + "is negative");
            }
            
            else{
                System.out.println(arr[i] + "is zero");
            }
            
            
        }
        
        for(int i = 0;i<arr.length;i++){
            if(arr[0]==arr[arr.length-1]){
                System.out.println("the elements at the first and last index are equal");
                break;
            }
            else if(arr[0]<arr[arr.length-1]){
                System.out.println("the element at first is smaller than the last one ");
                break;
            }
            else if(arr[0]>arr[arr.length-1]){
                System.out.println("the element at the first index is greater than the last one");
                break;
            }
        }
        

        
        
        
        
        input.close();
    }
}