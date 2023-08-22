package FileHandle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
	public static void main (String []args)throws IOException {
		InputStream input =  FileInputStream ("C:\\test\\test2.txt");
		OutputStream output = new FileOutputStream("C:\\test\\copy2.txt");
		int content = input.read();
		while (content != -1)
		{
			output.write(content);
			content = input.read();
			
		}
		output.flush();
		
	}

	private static InputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

