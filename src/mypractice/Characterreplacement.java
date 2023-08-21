package mypractice;

public class Characterreplacement {
	    public static void main(String[] args) {
	        String[] stringArray = {"apple", "banana", "cherry", "date"};

	        char targetChar = 'a'; // The character you want to replace
	        char replacementChar = 'A'; // The character to replace with

	        for (int i = 0; i < stringArray.length; i++) {
	            String originalString = stringArray[i];
	            String modifiedString = originalString.replace(targetChar, replacementChar);
	            stringArray[i] = modifiedString;
	        }

	        // Print the modified array
	        for (String modifiedString : stringArray) {
	            System.out.println(modifiedString);
	        }
	    }

}
