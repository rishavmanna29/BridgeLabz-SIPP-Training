import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int greatestFactor = 1;
        
    for(int i=number -1;i>1;i--){
            
            if(number%i==0){
                greatestFactor = i;
            }
            break;
        
        }
        System.out.println("the greatest factor of the number is: " + greatestFactor);

        input.close();
    }
}
