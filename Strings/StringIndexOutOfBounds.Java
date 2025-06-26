import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateStringIndexOutOfBoundsException(String input) {
        System.out.println(input.charAt(100));
    }

    public static void handleStringIndexOutOfBoundsException(String input) {
        try {
            System.out.println(input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        generateStringIndexOutOfBoundsException(input);
        handleStringIndexOutOfBoundsException(input);
    }
}
