import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();

        if (number >= 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            
            for (int counter = 100; counter > 0; counter--) {
                if (counter % number == 0 && counter < 100) {
                    System.out.print(counter + " ");
                }
            }
        } else {
            System.out.print("please enter a number less than 100");
        }

        input.close();
    }
}
