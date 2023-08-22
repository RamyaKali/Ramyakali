package Assignments;

import java.util.Scanner;

public class Replacement {

	 public void replace() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String:");
	  String str=sc.nextLine();
	  
	  System.out.println("Enter which Character to replace:");
	  char replace=sc.next().charAt(0);
	  
	  System.out.println("Enter the Character to replace:");
	  char replaceWith=sc.next().charAt(0);
	  
	  for(int i=0;i<str.length();i++) {
	   if(str.charAt(i)==replace) {
	    System.out.print(replaceWith);
	   }
	   else {
	    System.out.print(str.charAt(i));
	   }
	  }
	 }
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Replacement replace=new Replacement();
	  replace.replace();
	 }

	}


