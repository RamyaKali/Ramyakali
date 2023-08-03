package Ass;

public class Variable {


	private String Gender ="female"; // global
	public static int Age = 25;  // global
	public static String Name = "ramya";
	
	private void GetName()
	{
		String Name = "ramya"; //local variable
		System.out.println(Name);
		//System.out.println(Gender);
		
	}
	
	protected void Course()
	{
		System.out.println(Gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (" Name is" + Name);
		System.out.println (" age is" + Age);
	
		

	}

}



