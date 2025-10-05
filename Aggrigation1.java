package javaPrograms;

class Course{
	String courseName;
	int courseID;
	int duration;
	public Course(String courseName, int courseID, int duration) {
		this.courseName = courseName;
		this.courseID = courseID;
		this.duration = duration;
	}
	void display() {
		System.out.println("Course Name: "+ courseName);
		System.out.println("Course ID: "+ courseID);
		System.out.println("Course Duration: "+ duration +"hr");
	}
	
}

class Student{
	String studentName;
	int usn;
	Course cs;
	public Student(String studentName, int usn, Course cs) {
		this.studentName = studentName;
		this.usn = usn;
		this.cs = cs;
	}
	
	void display() {
		System.out.println("Student Name: "+ studentName);
		System.out.println("Student ID: "+ usn);
		cs.display();
	}
}

public class Aggrigation1 {

	public static void main(String[] args) {
		Course course = new Course("CSE", 99, 90);
		
		Student std = new Student("Chaitanya", 20, course);
		
		std.display();
		
		std=null;  // killing student
		System.out.println("**********************************************");
		course.display();
		
	}

}
