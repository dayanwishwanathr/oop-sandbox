package LabSheet02;

public class Person {
	String name;
	String address;
	
	public Person() {
		
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}



	public void showDetails() {
		System.out.println("My name is "+this.name);
		System.out.println("I am from "+this.address);
		
	}

}
