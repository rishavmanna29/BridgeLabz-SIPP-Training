
import java.io.*;
public class TextFileRead {
    public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("C:\\Users\\piyus\\eclipse-workspace\\practice\\src\\StreamIO\\Hello");
			FileOutputStream fw = new FileOutputStream("C:\\Users\\piyus\\eclipse-workspace\\practice\\src\\StreamIO\\Output");
			
			int CharData;
			while((CharData=fr.read())!= -1) {
				fw.write(CharData);
			}
			System.out.println("file contents copied successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}
