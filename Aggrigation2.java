package javaPrograms;

class Book{
	String bookName;
	int bookID;
	int price;
	String category;
	public Book(String bookName, int bookID, int price, String category) {
		this.bookName = bookName;
		this.bookID = bookID;
		this.price = price;
		this.category = category;
	}
	void display() {
		System.out.println("Book Name: "+ bookName);
		System.out.println("Book ID: "+ bookID);
		System.out.println("Book Duration: Rs."+price);
		System.out.println("Book Category: "+ category);
	}
}

class Author{
	String authName;
	int age;
	String address;
	String awards;
	Book bk;
	public Author(String authName, int age, String address, String awards, Book bk) {
		this.authName = authName;
		this.age = age;
		this.address = address;
		this.awards = awards;
		this.bk = bk;
	}
	void display() {
		System.out.println("Author Name: "+ authName);
		System.out.println("Author Age: "+ age);
		System.out.println("Author Address:"+address);
		System.out.println("Author Awarded: "+ awards);
		bk.display();
	}
	
}

public class Aggrigation2 {

	public static void main(String[] args) {
		Book b = new Book("Harry potter", 154, 1500, "Frictional");
		Author a =new Author("JK rowling", 100, "Home", "PVB", b);
		
		a.display();
		
		a= null; // killing 
		System.out.println("*****************************************************");
		b.display();
	}

}
