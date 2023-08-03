package Ass;

public class Age { 
	
	public static void ageint (int age) { 
	System.out.println ("enter your age" +age);
	}
	public static void main (String args[]) {
		int age=16;
		
		switch (age) {
		case (16):
			System.out.println(" you are  under 18");
			break;
		case (18):
			System.out.println ("You are eligible for voting");
			break;
		case (65):
			System.out.println("You are senior citizen");
			default:
				System.out.println("Enter valid age");
			}
	}

}
