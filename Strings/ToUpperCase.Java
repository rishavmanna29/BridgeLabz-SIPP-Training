import java.util.Scanner;

public class UpperCaseConverter {

    public static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String builtIn = original.toUpperCase();
        String manual = toUpperCaseManual(original);
        boolean isEqual = compareStrings(builtIn, manual);
        System.out.println("Original: " + original);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Manual:   " + manual);
        System.out.println("Are equal: " + isEqual);
    }
}
