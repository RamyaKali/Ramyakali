package Assignments;

import java.util.Scanner;

public class printNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        
        System.out.println("Numbers in reverse order:");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nNumbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}



