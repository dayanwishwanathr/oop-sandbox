package Tutorial4;

class AgeValidationDemo {

	public static void validateAge (int age) throws AgeValidationException {
		if(age>0 & age<120 ) {
			
		}else {
			throw new AgeValidationException("Error: Invalid age");
		}
	}

	
	public static void main(String args[]) throws AgeValidationException {
		
//		AgeValidationDemo a = new AgeValidationDemo();
//		
//		try {
//			a.validateAge(-50);
//		} catch (AgeValidationException e) {
//			
//			e.printStackTrace();
//		}
		
		try {
			validateAge(50);
		} catch (AgeValidationException e) {
			e.printStackTrace();
		}
		
//		validateAge(-50);
		
		
	}
	
	
}
