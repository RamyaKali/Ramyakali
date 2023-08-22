package FileHandle;

import java.io.File;
import java.io.IOException;

public class Filedetailhandle {
public static void main ( String []args) throws IOException {
	/*File file = new File( "C:\\Users\\Kaliyannan P\\Ramyasfile\\sub");
boolean present = file.exists();
System.out.println("Folder present:"+present);
if (present == false) {
	
	file.mkdirs(); 
}
present = file.exists();
System.out.println("Folder present:"+present);*/
	/*File file = new File( "C:\\Users\\Kaliyannan P\\Ramyasfile\\test.txt");
	boolean present = file.exists();
	if (present == false)
		try {
			boolean created  = file.createNewFile();
			System.out.println("File present:"+created);
		}catch (IOException e) {
			e.printStackTrace();
			
			
		}*/

	File file = new File( "C:\\Users\\Kaliyannan P\\Ramyasfile\\test.txt");
	 file.createNewFile();
	 File newname = new File( "C:\\Users\\Kaliyannan P\\Ramyasfile\\testfilehandle.txt");
	 file.renameTo(newname);
	 boolean renamesuccess  = file.renameTo(newname);
	 System.out.println(" Rename success "+ renamesuccess);
	 System.out.println( "Filename:" + newname.getName());
	 
	 
}
}
