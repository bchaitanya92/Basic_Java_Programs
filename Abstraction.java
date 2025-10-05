package javaPrograms;

abstract class Calculator{
	final int cal=10;
	String cl;
	public Calculator(String cl) {
		this.cl = cl;
	}
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	void add() {
		System.out.println("Addition");
	}
	abstract void sub();
	abstract void mul();
	abstract void div();
}

class Calc extends Calculator{
	
	public Calc(String cl) {
		super(cl);
		System.out.println("Claculation: " +cl);
	}
	@Override
	void sub() {
		System.out.println("Substraction");		
	}
	@Override
	void mul() {
		System.out.println("Multiplication");		
	}
	@Override
	void div() {
		System.out.println("Division");		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Calculator c = null;
		Calc cc = new Calc("Addition");
		cc.add();
		cc.sub();
		cc.mul();
		cc.div();

	}

}
