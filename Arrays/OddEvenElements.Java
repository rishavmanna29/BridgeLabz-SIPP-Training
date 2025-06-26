
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length the array: ");
        int size = input.nextInt();
        
        System.out.println("enter elements: ");
        int[] tempArr = new int[size]; 
        
        
        int[] Oddarr = new int[size];
        int[] Evenarr = new int[size];
        for(int i=0;i<size;i++){
            tempArr[i]=input.nextInt();
            if(tempArr[i]%2==0){
                Evenarr[i] = tempArr[i];
                continue;
            }
            else if(tempArr[i]%2!=0){
                Oddarr[i] = tempArr[i];
                continue;
            }
        }
        
        for(int i = 0;i<size;i++){
            System.out.println("odd array: " + Oddarr[i] + " ");
            
        }
        
        for(int i = 0;i<size;i++){
            System.out.println("even array: " + Evenarr[i] + " ");
            
        }
        
          
       input.close();   
            
    }
}
        
        

        
        
        
        
 