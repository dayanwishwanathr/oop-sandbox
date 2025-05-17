package LabSheet02;

public class Student extends Person {

	String studentid;

	public Student() {
		
	}
	
	public Student(String name,String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("My student ID is "+this.studentid);
	}
	
	

	
}
