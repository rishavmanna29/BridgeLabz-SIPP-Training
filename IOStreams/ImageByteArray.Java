import java.io.*;
import java.util.Arrays;

public class ImageByteArray {
    public static void main(String[] args) {
        try {
            File file = new File("input.jpg");
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, read);
            }
            fis.close();

            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream("output.jpg");

            while ((read = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }

            fos.close();
            System.out.println("Image copied using byte array.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
