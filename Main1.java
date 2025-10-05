package javaPrograms;

import java.util.Scanner;

class Car {
	void start() {
		System.out.println("Car is Starting.");
	}

	void stop() {
		System.out.println("Car Stopped.");
	}
	void run() {
		System.out.println("Car is Running.");
	}
}

class Bmw extends Car {
	void run() {
		System.out.println("Bmw is Running.");
	}
}

class Ferrari extends Car {
	void run() {
		System.out.println("Ferrari is Running.");
	}
}

class Nano extends Car {
	void run() {
		System.out.println("Nano is Running.");
	}
}

//factor-design-pattern
class Rto{
	static Car getmyCar(String str) {
		if(str.equals("BMW")){
			return new Bmw();
		}
		else if(str.equals("Ferrai")){
			return new Ferrari();
		}
		else if(str.equals("Nano")){
			return new Nano();
		}return null;
	}
}

public class Main1 {

	public static void main(String[] args) {
		
//		Car c = null;
//		c=new Bmw();
//		c.start();
//		c.stop();
//		c.run();
//		c=new Ferrari();
//		c.start();
//		c.stop();
//		c.run();
//		c=new Nano();
//		c.start();
//		c.stop();
//		c.run();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice: \n 1.BMW \n 2.Ferrari \n 3.Nano");
		
		String str = sc.next();
		
		Car car = Rto.getmyCar(str);
		if (car != null) {
			car.start();
			car.stop();
			car.run();
		}else {
			System.out.println("enter valid choice");
		}
	}
}
