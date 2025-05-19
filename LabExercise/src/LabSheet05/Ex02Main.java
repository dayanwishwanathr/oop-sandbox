package LabSheet05;

//Interface Lab Sheet

interface ICompute {

	void calculate();
	void display();

}

class Person implements ICompute {

	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;

	public Person (String name,double basicSal, double otRate, double otHrs ) {
		this.name=name;
		this.basicSal=basicSal;
		this.otRate= otRate;
		this.otHrs = otHrs;
	}
	
	public void calculate() {
		netSal = basicSal + (otRate*otHrs);
	}
	
	public void display() { 
		System.out.println(name+" "+basicSal+" "+otRate+" "+otHrs+" "+netSal);
		
	}
	
}

class Box implements ICompute{

	private int length, width, height;
	private int volume;
	
	public Box (int length, int width,int height ) {
		this.length=length;
		this.width=width;
		this.height=height;
		
	}

	@Override
	public void calculate() {
		volume = (length*width*height);
		
	}

	@Override
	public void display() {
		System.out.println(length+" "+ width+" "+height+" Volume = "+volume);	
	}

}

public class Ex02Main {

	public static void main(String[] args) {
		ICompute ob1 = new Person("Danushka",40000, 1000, 5);
		ob1.calculate();
		ob1.display();

		ICompute ob2 = new Box(10, 20, 30);
		ob2.calculate();
		ob2.display();
		
		
	}
		
}