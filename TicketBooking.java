package javaPrograms;

import java.util.Scanner;

class InsufficientTicketException extends Exception{
	
	public String getMessage() {
		return "Mada Tickets are limited to be purchased for a singlr head";
	}
}

public class TicketBooking {

	public static void main(String[] args) throws InsufficientTicketException {
		
		Scanner sc = new Scanner(System.in);
		String pro;
		System.out.println("Enter the Principle Amount of Tickets in the Counter: ");
		int principle = sc.nextInt();
		
		System.out.println("Enter the no. of Tickets that a person can buy(Limit): ");
		int limit = sc.nextInt();
		
		
		do {
			
			System.out.println("Enter the no. of Tickets to be purchased: ");
			int tw = sc.nextInt();
			if (tw>limit) {
				throw new InsufficientTicketException();
			} else {
				principle = principle - tw;
			}
			System.out.println("The Principle Amount in the Bank: "+principle);
			
		
		System.out.println("Do you want to proced (Y/N):");
		pro = sc.next();
		
		}
		while (pro.equalsIgnoreCase("Y")); 

	}

}
