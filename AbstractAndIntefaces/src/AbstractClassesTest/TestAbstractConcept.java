package AbstractClassesTest;

abstract class Animal {
	
	public void eat() {
		System.out.println("I am eating...");
	}
	
	abstract public void makeSound();
	
}

class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal {
	
	public void makeSound() {
		System.out.println("Cat barking");
	}
}

interface intf1 {
	final int g =10;
	
	public void hit();
	
}

public class TestAbstractConcept {

	public static void main(String[] args) {

		Animal dog = new Dog();
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.eat();
		cat.makeSound();
	}

}
