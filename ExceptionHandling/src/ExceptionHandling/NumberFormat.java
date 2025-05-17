package ExceptionHandling;

public class NumberFormat {

	public static void main(String[] args) {
		
		// String pnum = "564546";
		
		try {
			String pnum = "Hello564546";
			int num = Integer.parseInt(pnum);
			
		}catch(NumberFormatException e) {
			System.out.println("Exception: "+e);
			System.out.println("Enter Only numbers");
		
		}finally {
			System.out.println("Hello Finally block is here");
		}
		System.out.println("Im also can run");

	}

}
