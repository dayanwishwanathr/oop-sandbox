package LabSheet05;

//Lab Sheet on Abstract Classes
//Starter Code


abstract class Animal {

	private String name;
	
	public Animal () {
		System.out.println("Animal constructor called");
	}

	public Animal(String name) {
		this.name = name;
	}

	abstract public String speak();

	public void display() {
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}

}

class Dog extends Animal {

	public Dog () {
		super();
	}
	
	public Dog(String name) {
		super(name);

	}

	public String speak() {
		return "Bow Wow";
	}
}

class Cat extends Animal {
	
	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}

	public String speak() {
		return "Meow Meow";
	}
	
}

class ToyCat extends Cat {

	public ToyCat() {
		super();
	}
	
	String manufacturer;

	public ToyCat(String name, String manufacturer) {
		super(name);
		this.manufacturer = manufacturer;
	}

	public void display() {
		super.display();
		System.out.println("I am from " + manufacturer + ".");
	}

}


public class Ex01Main {
	
	public static void main(String[] args) {
		
		Cat mycat = new Cat("Micky");
		mycat.display();
		
		Dog mydog = new Dog("Rover");
		mydog.display();
		
		ToyCat mytoy = new ToyCat("kittie","Toysrus");
		mytoy.display();
		
		Cat tc = new ToyCat();
		
	}
	
}

