package ExerciseVariableTypes;

public class main {

	public static void main(String[] args) {
		
		Toy toy1 = new Toy("Toy Car", "$10");
		Toy toy2 = new Toy("Toy Train", "$15");
		
		toy1.showToyDetaits();
		toy1.decorateToy();
		
		toy2.showToyDetaits();
		toy2.decorateToy();
		
		
	}

}
