import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = input.nextLine();

        int[] freq = new int[10];

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                freq[digit]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
