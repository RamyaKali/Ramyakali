package FileHandle;

import java.io.File;

public class Mainfile {

	public static void main (String []args) {
		try {
			
		File F = new File("C:\\test\\test2.txt");
		if (F.createNewFile())
		{
			System.out.println(" File created");
		}else {
			System.out.println(" file doesnt exists");
		}
		}catch(Exception e) {
			System.out.println("error");
			
		}}
	
}
