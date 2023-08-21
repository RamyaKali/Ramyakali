package Assignments;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eligiblity for vote");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
	switch (age) {
	case 18:
		System.out.println(" Youur age is 18 so your are eligible to vote");
         break;
    case 10 : 
    	System.out.println(" You are not eligible");
    break;
    case 65:
    	System.out.println(" You are senior citizen");
	}
	}
}

