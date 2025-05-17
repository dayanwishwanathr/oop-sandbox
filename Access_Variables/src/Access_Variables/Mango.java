package Access_Variables;

public class Mango {
	
	static String name = "TJC";
	int amount =50;

	public void cutting () {
		System.out.println("Cutting");
	}
	
	public static void mixing () {
		System.out.println("Mixing");
	}
	
	
	public static void main(String[] args) {
//		
//		String color = "Yellow"; // Local Variable
//		
//		System.out.println(name); // Static Variable Accessing
//		
//		System.out.println(color); // Local Variable Accessing
//		
//		// To access instance Variable we need to create a object
//		Mango m = new Mango();
//		
//		System.out.println(m.amount); // Instance Variable Accessing
//		
//		m.cutting();
//		Mango.mixing();
//		
		
		//Onother class 
		
		System.out.println(Pinapple.name);
		
		Pinapple y = new Pinapple();
		System.out.println(y.amount);
		
		Pinapple.mixxing();
		y.cutting();
		String namePine = Pinapple.mixxing();
		System.out.println();
		System.out.println(namePine);
		System.out.println();
		System.out.println();
		
		System.out.println(Pinapple.mixxing());
		
		
		
		
	}

}
