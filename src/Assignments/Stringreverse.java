package Assignments;

public class Stringreverse {
	public static void main (String args[]) {
		String name = "Ramyaganesan";
		 String ReversedString = "";
		 for (int i=name.length()-1;i>=0;i--) {
			 ReversedString = ReversedString + name.charAt(i);		 
			 }
	
	System.out.println(" The Reversed string is"+ name + "");
	System.out.println(ReversedString);
	}
}

