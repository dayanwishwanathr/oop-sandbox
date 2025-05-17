package ExceptionHandling;

public class ExampleException {

	public static void main(String[] args) {

		try {
			int a = 10/0;
		
		} catch (ArithmeticException e) {
		
			System.out.println("Error here");
			System.out.println("Message: "+e.getMessage());
		}
	}

}
