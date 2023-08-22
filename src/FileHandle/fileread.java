package FileHandle;
import java.io.File;
import java.util.Scanner;


public class fileread {

	public static void main (String []args) {
		try {
			
		File F = new File("C:\\test\\test2.txt");
        Scanner  scan =new Scanner(F);
        
        while (scan.hasNextLine()) {
        	System.out.println(scan.nextLine());
        }			
		
} catch (Exception e) {
	System.out.println ("Error");
	
	
}
	}
}
