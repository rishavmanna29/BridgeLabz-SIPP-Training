import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        }

        else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
