import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        int counter = 1;
        while(counter<=number){
            if(number%counter==0){
                System.out.println("factor: " + counter);
            }
            counter++;
        }

        input.close();
    }
}
