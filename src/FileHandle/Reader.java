package FileHandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
	public static void main (String[]args) throws IOException {
		File file = new File("C:\\test\\sample.txt");
		FileWriter fwriter = new FileWriter(file,true);
		BufferedWriter bfwriter = new BufferedWriter(fwriter);
		bfwriter.write("Tamil");
		bfwriter.flush();
		bfwriter.newLine();
		bfwriter.write("English");
		bfwriter.newLine();
		bfwriter.write("Maths");
		bfwriter.flush();
		bfwriter.close();
		FileReader freader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(freader);
		String line = bReader.readLine();
		int lineCount =0;
		int sentenceCount = 0;
		int wordCount =0;
		int charCount =0;
		while(line!= null) {
			
			String [] sentence = line.split("[.]");
			sentenceCount = sentenceCount +sentence.length;
			String[]words = line.split(" ");
			wordCount = wordCount+ words.length;
			System.out.println(line);
			charCount = charCount + line.length();
			lineCount++;
			line = bReader.readLine();
		}
		System.out.println("No.of.Linecounts"+lineCount);
		System.out.println("No.of.sentence counts"+ sentenceCount);
		System.out.println("No.of.words counts"+ wordCount);
		System.out.println("No.of.charcounts"+ charCount);
		
	}

}
