
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter elements in the array: ");
        
        int[] arr = new int[10];
        
        for(int i=1;i<arr.length;i++){
            arr[i] = input.nextInt();
            if(arr[i]==0){
                System.out.println("please enter an age value greater than zero and run the program again...");
                break;
            }
            
            else{
                continue;
            }
        }
        
        for(int i=1;i<arr.length;i++){
            
            
            if(arr[i]>=18){
                System.out.println("guy at" + " " + i + " th" + " index can vote"); 
            }
            else if(arr[i]<18 && arr[i]>0){
                System.out.println("guy at" + " " + i + " th" + " index cannot vote");
            }
          }
          
          
            
    }
}
        
        

        
        
        
        
 