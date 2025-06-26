import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        if (original % sum == 0) {
            System.out.println("Harshad Number");
        }

        else {
            System.out.println("Not a Harshad Number");
        }

        scanner.close();
    }
}
