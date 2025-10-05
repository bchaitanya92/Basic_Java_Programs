package javaPrograms;

import java.util.Scanner;

abstract class Area{
	Scanner sc = new Scanner(System.in);
    double area;

	abstract void input();
	abstract void process();
	abstract void display();
}

class Circle extends Area {
    double radius;

    @Override
    void input() {
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    @Override
    void process() {
        area = 3.14 * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Area of the circle is: " + area);
    }
}

class Triangle extends Area {
    double breadth;
    double height;

    @Override
    void input() {
        System.out.print("Enter the breadth of the Triangle: ");
        breadth = sc.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        height = sc.nextDouble();
    }

    @Override
    void process() {
        area = 3.14 * breadth * height;
    }

    @Override
    void display() {
        System.out.println("Area of the circle is: " + area);
    }
}

class Square extends Area {
    double a;

    @Override
    void input() {
        System.out.print("Enter the side of the square: ");
        a = sc.nextDouble();
    }

    @Override
    void process() {
        area = a * a;
    }

    @Override
    void display() {
        System.out.println("Area of the square is: " + area);
    }
}

public class Abstraction1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");

        int choice = scan.nextInt();
        Area ar;
        
        switch (choice) {
		case 1: {
			ar = new Circle();
			ar.input();
			ar.process();
			ar.display();
			break;
		}
		case 2: {
			ar = new Triangle();
			ar.input();
			ar.process();
			ar.display();
			break;
		}
		case 3: {
			ar = new Square();
			ar.input();
			ar.process();
			ar.display();
			break;
		}
		default:
			System.out.println("Enter valid choice.");
		}
	}

}
