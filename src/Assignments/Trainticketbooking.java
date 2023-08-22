package Assignments;
import java.util.Scanner;
public class Trainticketbooking {
	   public void trainBookings() {

	   Scanner enterTickets = new Scanner(System.in); 
	         System.out.println("ENTER YOUR DESIRED NO.OF.TICKETS : ");
	         int ticketAvailable = enterTickets.nextInt();  
	      
	  
	  if(ticketAvailable>25) {
	   System.out.println("Only 25 tickets are available. You have entered more than available tickets");
	   
	   Scanner input = new Scanner(System.in);
	   System.out.println("Do you want to proceed with available tickets or not ? Press y or n for yes or no respectively to proceed ");
	   String tickets = input.next();
	   
	   
	   
	   if( tickets.equals("y")) {
	   int i = 1;
	   for(i=1;i<=25;i++) {
	    System.out.println("Congratulations you've booked your ticket");
	       }
	   
	   }
	   else if(tickets.equals("n")) {
	    
	    
	           System.out.println("ENTER YOUR DESIRED NO.OF.TICKETS : ");
	           int ticketAvailable1 = enterTickets.nextInt();  
	           if(ticketAvailable1<=25) {
	            int i = 1;
	      for(i=1;i<=25;i++) {
	       System.out.println("Congratulations you've booked your ticket");
	          }
	           }
	   
	   }
	   else {
	     System.out.println("just select between y or n");
	   }
		
	  }
	  else {
	    
	      int i = ticketAvailable ; 
	      
	      while (i >= 1) { 
	          System.out.println("Congratulations you've booked your ticket");
	          i--; 
	      }
	  }

	  
	 }
		
	 public static void main(String[] args) {
	  
		 Trainticketbooking TB = new Trainticketbooking();
	  
	  TB.trainBookings();

	 }

	}



