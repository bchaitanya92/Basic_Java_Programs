package javaPrograms;

import java.util.Scanner;
class UnderAgeException extends Exception{
	public UnderAgeException() {
	}
	public UnderAgeException(String message) {
		super(message);
	}
}
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Oh Still ! Alive";
	}
}


public class CustimizeException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of the Driver");
		int age = sc.nextInt();
		
		try {
			canIDrive(age);
		} catch (OverAgeException | UnderAgeException e) {
			e.printStackTrace();
		}

	}
	
	private static void canIDrive (int age) throws OverAgeException, UnderAgeException{
		if (age>=18 && age<=65) {
			System.out.println("Yes You Can Drive.");
		} else if (age<18) {
			throw new UnderAgeException("Please Grow UP First.");
		}else if (age>18) {
			throw new OverAgeException();
		}
	}

}
