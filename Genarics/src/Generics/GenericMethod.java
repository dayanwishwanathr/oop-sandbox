package Generics;

public class GenericMethod {

	public static <T> void printData(T data) {
		
    	System.out.println("Data: " + data);
    
    }
	
	
	
	public static <E> void printArray(E array[]) {
		
		for(E a : array) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	    public static void main(String[] args) {
	       
//	    	printData(100);         // Integer
//	        printData("Dayan");     // String
//	        printData(5.5);         // Double
	    
	    	
	    	Integer intArray [] = {12, 14, 51, 76};
	    	Character charArray [] = {'D','A','Y','A','N'};
	    	
	    	printArray(intArray);
	    	printArray(charArray);
	    	
	    }
	    
	}



