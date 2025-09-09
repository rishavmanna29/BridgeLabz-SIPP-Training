
import java.io.*;
public class RWUsingBufferedStreams {
	public static void main(String[] args) {
		try {
		    BufferedInputStream br = new BufferedInputStream(new FileInputStream("PassAbsoluteFilePath"));
		    BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("PassAbsoluteFilePath")); 
		    
		    byte[] array = new byte[100*100*1024];
		    int byteData;
		    
		    while((byteData=br.read(array))!= -1) {
		    	bw.write(array, 0, byteData);//inside array start writing from the starting position(0) in the array and byteData is the number of bytes that are being written from the buffer
		    }
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
