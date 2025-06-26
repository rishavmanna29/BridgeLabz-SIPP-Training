import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year is not in the Gregorian calendar");
        }

        else if (year % 400 == 0) {
            System.out.println("Leap Year");
        }

        else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        }

        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        }

        else {
            System.out.println("Not a Leap Year");
        }

        scanner.close();
    }
}
