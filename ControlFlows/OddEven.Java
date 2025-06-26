import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int counter = 0;
        while(counter<=number){
            if(counter%2==0){
                System.out.println(counter + " is an even number");
            }
            else if(counter%2!=0){
                System.out.println(counter + " is an odd number");
            }
            counter++;
        }

        input.close();
    }
}
