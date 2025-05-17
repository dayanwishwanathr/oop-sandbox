package ExceptionHandling;

class Cal {
	
	int x,y;
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int divide(int x, int y) throws ArithmeticException{ // we can add more Exceptions types here (if need)
		return x/y;
	}
	
	
}

public class MathOp {

	public static void main(String[] args) {

		Cal c = new Cal();
		
		System.out.println(c.add(5, 5));
		
		try {
			System.out.println(c.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("Numbers cant divide by 0");
		}
		
		System.out.println("Yes, now i can run");
		
		
	}

}
