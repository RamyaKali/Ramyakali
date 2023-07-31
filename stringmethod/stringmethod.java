package stringmethod;

public class stringmethod {
	public static String parameter2(String name) { 
		System.out.println("My name is "+ name);
		return name;//return method 2 
		
	}
	public static void parameter1() {
		parameter2("Megha");//method2 has to be called another method1
		
	}
	public static void main (String args[]) {
		stringmethod string1 = new stringmethod();
		parameter1();// method1 is being called in main function
		
		
	}

}
