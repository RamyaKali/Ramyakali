package Assignments;


public class Methods {
	static int num1= 15;
	static int num2 = 3;


	public static void main(String[] args) {
		Methods c = new Methods();
		System.out.println(" The Addition is  is :"+ Math.addExact( num1,num2));
		System.out.println ( " Difference is :"+ Math.multiplyExact(num2, num1));
	
	}
	public   int  add (int a, int b) { 
		return a+b;
			
		}
	public int diff ( int a, int b) {
		return a-b;
		
	}
	
}




