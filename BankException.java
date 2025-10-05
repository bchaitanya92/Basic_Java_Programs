package javaPrograms;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	
	public String getMessage() {
		return "Your Broke";
	}
}

public class BankException {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc = new Scanner(System.in);
		String pro;
		System.out.println("Enter the Principle Amount in the Bank: ");
		int principle = sc.nextInt();
		
		do {
		
		System.out.println("Select the Choice: \n 1.Deposit \n 2.Withdrawl");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1: 
			System.out.println("Enter the Deposit Amount: ");
			int deposit = sc.nextInt();
			principle = principle + deposit;
			System.out.println("The Principle Amount in the Bank: "+principle);
			break;
		case 2: 
			System.out.println("Enter the Withdrawl Amount: ");
			int withdrawl = sc.nextInt();
			if (withdrawl>principle) {
				throw new InsufficientFundsException();
			} else {
				principle = principle - withdrawl;
			}
			System.out.println("The Principle Amount in the Bank: "+principle);
			break;
		}
		
		System.out.println("Do you want to proced (Y/N):");
		pro = sc.next();
		
		}
		while (pro.equalsIgnoreCase("Y")); 
			
		}
		
		}

