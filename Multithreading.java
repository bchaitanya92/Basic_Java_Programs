package javaPrograms;

import java.util.Scanner;

class MyTask extends Thread{
	String name;

	public MyTask(String name) {
		this.name = name;
	}

	public MyTask() {
	}
	
	void printUpperCase() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	void printLowerCase() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	void printNumber() {
		for (int i = 0; i <= 9 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run(){
		this.name=name;
		if (name.equals("uc")) {
			printUpperCase();
		} else if (name.equals("lc")){
			printLowerCase();
		}else if (name.equals("pn")) {
			printNumber();
		}
	}
}

public class Multithreading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the str:");
		String str = sc.next();
		
		new Thread(new MyTask(str)).start();
//		new Thread(new MyTask("lc")).start();
//		new Thread(new MyTask("pn")).start();

	}

}
