package CollactionFrameworks;

public class WrapperCoveringClass {

	public static void main(String[] args) {

		int x = 10;
		
		Integer res = x; // AutoBoxing
		
		System.out.println(res);
		
		Integer res2 = new Integer(22);
		int x2= res2; // Unboxing
		
		System.out.println(x2);
	}

}
