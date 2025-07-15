public class StringBufferConcat {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java"};

        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word).append(" ");
        }

        System.out.println("Concatenated: " + sb.toString().trim());
    }
}
