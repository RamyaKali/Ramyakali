package FileHandle;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWriting {
	public static void main (String []args) throws IOException, InterruptedException {
		
	File F = new File ("C:\\test\\sample.txt");
	F.createNewFile();
	
	FileWriter writer = new FileWriter (F);
	writer.write(65);
	writer.write("hello how are you");
	writer.flush();
	writer.close();
	
	FileReader filereader = new FileReader(F);
	char []ch = new char[(int)F.length()];
	System.out.println(ch.length);
	Thread.sleep(600);
	filereader.read(ch);
	for(char ch1 : ch)
	{
		System.out.print(ch1);

	}
	
	/*filereader.read();
	int output = filereader.read();
	while(output != -1);
	{
		System.out.println(output);
		output = filereader.read();*/	}
}

