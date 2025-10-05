package javaPrograms;

class Address{
	String location;
	int picode;
	public Address(String location, int picode) {
		this.location = location;
		this.picode = picode;
	}
	void display() {
		System.out.println("location: " + location);
		System.out.println("picode: " + picode);
	}
	
}

class Employee{
	String empName;
	int empId;
	Address ad;
	public Employee(String empName, int empId, Address ad) {
		this.empName = empName;
		this.empId = empId;
		this.ad = ad;
	}
	void display() {
		System.out.println("empName: " + empName);
		System.out.println("empId: " + empId);
		ad.display();
	}
	
}

public class Aggrigation {

	public static void main(String[] args) {
		Address a=new Address("mallasandra", 560065);
		
		Employee emp = new Employee("Chaitanya", 45, a);
		
		emp.display();
		
		emp=null;
		System.out.println("**********************************************");
		a.display();
		
	}

}
