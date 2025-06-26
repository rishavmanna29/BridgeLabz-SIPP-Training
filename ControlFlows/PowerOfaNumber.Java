import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.print("Enter a positive integer: ");
        int power = input.nextInt();
        int result = 1;
        for(int i=1;i<=power;i++){
            result*=number;
        
        }
        System.out.println("the power of the number is: " + result);

        input.close();
    }
}
