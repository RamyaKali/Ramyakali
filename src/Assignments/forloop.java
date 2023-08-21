package Assignments;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println (" starting the Number :");
		int start = scan.nextInt();
		System.out.println (" Endind the Number :");
		int end = scan.nextInt();
		for (int i= start;i>=start;i--)
		{
			System.out.println("  ");
		}
		System.out.println(" The start"+ start + " ending"+end);
		for (int i = start; i<=end;i=i+2) {
			
		System.out.println (i+"");

	}
	}
	
}


