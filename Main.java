package javaPrograms;

class Plane{
	void fly() {
		System.out.println("Plane is Flying.");  
	}
	void land() {
		System.out.println("Plane is Landing.");  
	}
	void carry() {
		System.out.println("Plane is Carrying.");  
	}
}

class PassengerPlane extends Plane{
	@Override
	void carry() {
		System.out.println("PassengerPlane is Carrying.");  
	}
}

class CargoPlane extends Plane{
	@Override
	void carry() {
		System.out.println("CargoPlane is Carrying.");  
	}
}

class FighterPlane extends Plane{
	@Override
	void carry() {
		System.out.println("FighterPlane is Carrying.");  
	}
}

public class Main {

	public static void main(String[] args) {
		
		Plane pp= null;
		pp=new PassengerPlane();
		pp.fly();
		pp.land();
		pp.carry();
		pp=new CargoPlane();
		pp.fly();
		pp.land();
		pp.carry();
		pp=new FighterPlane();
		pp.fly();
		pp.land();
		pp.carry();

	}

}
