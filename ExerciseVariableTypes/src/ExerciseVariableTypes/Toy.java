package ExerciseVariableTypes;

public class Toy {
	
	String name; // instance variable
	String  price; //instance variable
	
	static String StoreName = "GG Toy Store";
	
	public Toy(String name, String  price) {
		this.name=name;
		this.price=price;
	}
	
	public void showToyDetaits() {
		System.out.println("Toy Name: "+name);
		System.out.println("Toy Price: "+price);
		System.out.println("This toy from " +StoreName);
		
	}
	
	
	public void decorateToy() {
		String sticker = "Star";
		
		System.out.println("I add "+ sticker + " to " +name);
		System.out.println();
	}
	
	
}
