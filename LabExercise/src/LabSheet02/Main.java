package LabSheet02;

class Pet {
	private String name;
	private String owner;
	private int age;
	
	public Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.age = a;
		
	}
	
	public Pet(String n, String o) {
		this.name = n;
		this.owner = o;
		this.age = 0;
	}
	
	public void showDetails(){
		System.out.println("I am a pet. My name is "+this.name+". My owner is "+this.owner);
	}
	
}//end of the pet class

class Cat extends Pet{
	private int livesLeft;
	
	public Cat(String n, String o, int a, int l) {
		super(n, o, a);
		this.livesLeft = l;
	}
	
	public Cat(String n, String o) {
		super(n, o);
		this.livesLeft = 7;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("I am a cat. " +this.livesLeft + " lives remain for me.");
	}
	
}//end of the cat class


class Dog extends Pet{
	
	int noOfMasters;
	
	Dog(String n, String o, int a, int m) {
		super(n,o,a);
		this.noOfMasters=m;
	}
	
	Dog(String n, String o) {
		super(n,o);
		this.noOfMasters=1;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a dog. I have "+this.noOfMasters+" masters at home");
	}
	
}


public class Main {
	public static void main(String[] args){
		
		Pet p1 = new Pet("Lissie","Smith",3);
		p1.showDetails();
		
		Cat c1 = new Cat("Kyan", "Silva", 4, 4);
		c1.showDetails();
		
		System.out.println();
		
		Pet p2 = new Pet("Benzy","Dayan",3);
		p2.showDetails();
		
		Cat c2 = new Cat("Puusa", "Hasas", 4, 6);
		c2.showDetails();
		
		Dog d1 = new Dog("Syndy", "Nimal", 2, 2);
		d1.showDetails();
		
	}
	
}//end of the demo class









