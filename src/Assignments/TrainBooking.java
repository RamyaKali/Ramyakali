package Assignments;
import java.util.Scanner;
public class TrainBooking {
	
	    public static void main(String[] args) {
	        int totalSeats = 50;
	        int bookedSeats = 0;

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Available Seats: " + (totalSeats - bookedSeats));

	            if (bookedSeats >= totalSeats) {
	                System.out.println("Sorry, no more seats available.");
	                break;
	            }

	            System.out.print("Enter the number of seats to book (0 to exit): ");
	            int seatsToBook = scanner.nextInt();

	            if (seatsToBook == 0) {
	                System.out.println("Thank you for using the ticket booking system.");
	                break;
	            }

	            if (seatsToBook > (totalSeats - bookedSeats)) {
	                System.out.println("Not enough seats available. Please enter a lower number.");
	            } else {
	                bookedSeats += seatsToBook;
	                System.out.println("Booking successful! " + seatsToBook + " seat(s) booked.");
	            }
	        }

	        scanner.close();
	    }
}
