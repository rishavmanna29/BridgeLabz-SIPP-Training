import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) {
        String target = "java";
        int count = 0;

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
