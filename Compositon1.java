package javaPrograms;

//class Engine{
//	void start() {
//		System.out.println("Engine is starting...");
//	}
//}
//
//class Car1{
//	private final Engine eng;
//	public Car1() {
//		this.eng=new Engine();
//	}
//	void run() {
//		eng.start();
//	}
//}

class Books{
	void read() {
		System.out.println("Books are Read in Library...");
	}
}

class Library{
	private final Books bk;
	public Library() {
		this.bk=new Books();
	}
	void run() {
		bk.read();
	}
}

public class Compositon1 {

	public static void main(String[] args) {
		
//		Car1 c = new Car1();
//		c.run();
		
		Library lib = new Library();
		lib.run();

	}

}
