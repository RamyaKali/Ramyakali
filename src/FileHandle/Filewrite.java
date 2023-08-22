package FileHandle;

import java.io.FileWriter;


public class Filewrite {
	public static void main (String []args) {
		try {
			
		//File F = new File("C:\\test\\test2.txt");
        FileWriter filewriter = new FileWriter ("C:\\test\\test2.txt");
        filewriter.write("Hello world my name is ramya");
        filewriter.append("hi");
        filewriter.close();
        
        System.out.println (" File successfully writen");
        		
		
} catch (Exception e) {
	
}
	}
}
