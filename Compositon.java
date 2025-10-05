package javaPrograms;

class Heart{
	void pump() {
		System.out.println("Heart is pumping....");
	}
}

class Human{
	private final Heart heart;
	public Human() {
		this.heart=new Heart();
	}
	void live() {
		heart.pump();
	}
}

public class Compositon {

	public static void main(String[] args) {
		Human h = new Human();
		h.live();

	}

}
