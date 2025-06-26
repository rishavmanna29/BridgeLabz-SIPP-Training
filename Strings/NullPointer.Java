public class NullPointerDemo {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }
}
