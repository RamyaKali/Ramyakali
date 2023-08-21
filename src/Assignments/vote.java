package Assignments;

import java.util.Scanner;

public class vote {
	public static void main (String []args) {
		int age,diff;
		Scanner scan =  new Scanner (System.in);
		System.out.println(" Enter your age:");
		age = scan.nextInt();
		if (age >=18)
		{ 
			System.out.println (" You are eligible to vote");
		}else 
		{
			diff = (18-age);
			System.out.println(" You have to vote After  "+ diff+ "Years");
			
		}
		if (age >=80) {
			System.out.println(" you are senior citizen");
		}
	}
	}



