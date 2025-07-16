import java.io.*;

public class FileReadPerformance {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Make sure to have a test file

        try {
            long start = System.currentTimeMillis();
            FileReader fr = new FileReader(filePath);
            while (fr.read() != -1) {}
            fr.close();
            long end = System.currentTimeMillis();
            System.out.println("FileReader: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
            while (isr.read() != -1) {}
            isr.close();
            end = System.currentTimeMillis();
            System.out.println("InputStreamReader: " + (end - start) + " ms");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
