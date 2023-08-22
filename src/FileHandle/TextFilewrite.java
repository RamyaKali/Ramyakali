package FileHandle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TextFilewrite {
	
	private static final String FileUtils = null;

	String texttoWrite = "Hello this is Besant Technology";
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava9AMTambaram\\Input\\";
	String filename = "output1.txt";
	String infilepath ="C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava9AMTambaram\\Input\\";
	String infileName = "Sample.txt";
	String desfileName = "copyFile.txt";
	
	public void writeData() throws IOException
	{
		File f = new File(filepath+filename);
		FileOutputStream FS = new FileOutputStream(f);
		FS.write(texttoWrite.getBytes());
		System.out.println("Done");
	}
	
	public void writeDatawithFileWriter() throws IOException
	{
		File f = new File(filepath+filename);
		FileWriter FS = new FileWriter(f);
		FS.write(texttoWrite);
		System.out.println("Done");
	}
	
	public void readAndWrite() throws IOException
	{
		File inputfile = new File(infilepath+infileName);
		File outputfile = new File(filepath+filename);
		FileReader FS = new FileReader(inputfile);
		FileWriter FW = new FileWriter(outputfile);
		
		BufferedReader BS = new BufferedReader(FS);
		String i;
		while ((i =BS.readLine()) != null)
		{
			FW.write(i);
			FW.write("\n");
		}
		
		FW.close();
		FS.close();
		System.out.println("Done");
	}
	
	public void Copyfile() throws IOException
	{
		File SourceFile = new File(infilepath+infileName);
		File DestinationFile = new File(filepath+desfileName);
		
		FileUtils.copyFile(SourceFile, DestinationFile);
		System.out.println("Done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextFileWrite TW = new TextFileWrite();
		TW.Copyfile();
	}

}


