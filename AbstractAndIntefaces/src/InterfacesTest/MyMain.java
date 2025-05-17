package InterfacesTest;

class Employee implements Printable {
	
	int empID;
	String eName;
	
	public Employee (int empID,String eName ) {
		
		this.empID=empID;
		this.eName=eName;
		
	}
	
	public void print() {
		System.out.println(empID+" "+eName);
	}
	
}

class Book implements Printable {
	
	int bookID;
	String bookName;
	
	public Book (int bookID,String bookName ) {
		
		this.bookID=bookID;
		this.bookName=bookName;
		
	}
	
	public void print() {
		System.out.println(bookID+" "+bookName);
	}
	
}


public class MyMain {

	public static void main(String[] args) {
		
		Employee e = new Employee(1000, "Nimal");
		e.print();
		
		Book b = new Book(2000, "Atomic Habits");
		b.print();
		
		
	}

}
