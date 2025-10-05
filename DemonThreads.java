package javaPrograms;

import java.util.Scanner;

class Mask extends Thread{
	String name;

	public Mask() {
		
	}

	public Mask(String name) {
		this.name = name;
	}
	
	void spellingChech() {
		for ( ; ; ) {
			System.out.println("spellingChech");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	void typing() {
		for (int i=0;i<=5;i++) {
			System.out.println("typing");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	void autoCorrect() {
		for ( ; ; ) {
			System.out.println("autoCorrect");
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
			spellingChech();
		} else if (name.equals("lc")){
			autoCorrect();
		}else if (name.equals("pn")) {
			typing();
		}
	}


}

public class DemonThreads {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Mask m1= new Mask("uc");
		Mask m2= new Mask("lc");
		Mask m3= new Mask("pn");
		
		m1.setDaemon(true);
		m2.setDaemon(true);
		
		m1.setPriority(1);
		m2.setPriority(1);
		
		m3.start();
		m2.start();
		m1.start();
		
		

	}

}
