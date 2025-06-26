import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        generateIllegalArgumentException(input);
        handleIllegalArgumentException(input);
    }
}
