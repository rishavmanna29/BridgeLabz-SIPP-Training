
import java.util.*;
class Main {
    static Scanner sc = new Scanner(System.in);
    public static void ArrayIndexBounds(String[] text,int n){
        
        
        for(int i=0;i<=n;i++){
            text[i] = sc.nextLine().trim();
        }
        
        
    }
    
    public static void CatchException(String[] text,int n){
        try{ 
            
            for(int i=0;i<=n;i++){
                
                text[i] = sc.nextLine().trim();
            }
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException encountered");
        }
        
        catch(RuntimeException e){
            System.out.println("Runtime Exception encountered");
        }
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int length = input.nextInt();
        System.out.println("Enter elements of an array: ");
        String[] arr = new String[length];
        ArrayIndexBounds(arr,length);    
        CatchException(arr,length);
        
        
        
        
    }
}