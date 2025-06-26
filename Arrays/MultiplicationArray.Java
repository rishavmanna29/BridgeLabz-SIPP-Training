import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number between 6 and 9: ");
        int number = input.nextInt();
        int size = 11;
        int[] arr = new int[size];
        
        
        for(int i=1;i<=10;i++){
            arr[i] = number*i;
        }
        
        System.out.print("the array elements are: ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        

        
        
        
        

        input.close();
    }
}
