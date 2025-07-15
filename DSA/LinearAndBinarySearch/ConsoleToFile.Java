import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("output.txt");

            String line;
            System.out.println("Enter text (type 'exit' to finish):");

            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }

            writer.close();
            reader.close();
            System.out.println("Input saved to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
