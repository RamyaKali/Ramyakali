package FileHandle;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	public class Textfileread 
 
	{
		String filepath ="C:\\Users\\Kaliyannan P\\eclipse-workspace\\java\\src\\Ramyakali\\src\\FileHandle\\input";
		String fileName = "Sample.txt";
		public void TextFile() throws IOException, InterruptedException
		{
			File F = new File(filepath);
			Boolean isExist = F.isDirectory();
			System.out.println(isExist);
			String[] allFiles = F.list();
			for(String eachfile : allFiles)
			{
				System.out.println(eachfile);
				if(eachfile.equalsIgnoreCase("Sample.txt"))
				{
					File F1 = new File(filepath+eachfile);
					Boolean fileExist = F1.isFile();
					if (fileExist && F1.exists())
					{
						//FileInputStream FS = new FileInputStream(F1);
						FileReader FS = new FileReader(F1);
						BufferedReader BS = new BufferedReader(FS);
						//int i ;
						String i;
						//while ((i=FS.read()) != -1)
						while ((i =BS.readLine()) != null)
						{
							System.out.print(i);
							Thread.sleep(200);
							System.out.println(" ");
						}
					}
				}
			}
			
			
		}

		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			 Textfileread T = new  Textfileread ();
			T.TextFile();
		}

	}



