package mypractice;

public class StringtocharArrays {

	    public static void main(String[] args) {
	        String inputString = "Ramya";
	        char[] charArray = new char[inputString.length()];

	        for (int i = 0; i < inputString.length(); i++) {
	            charArray[i] = inputString.charAt(i);
	        }

	        System.out.println("Original String: " + inputString);
	        System.out.print("Char Array: ");
	        
	        for (char c : charArray) {
	            System.out.println(c + " ");
	        }
	    }
}
