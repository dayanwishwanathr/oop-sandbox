package Lecture01Excercises;

	public class trangleLoop {

	    public static void main(String[] args) {
	        int i = 0;
	        int rows = 5;
	        
	        while (i < rows) { // Loop for rows
	            int spaces = rows - i - 1;
	            int stars = i + 1;
	            
	            // Print spaces
	            int j = 0;
	            while (j < spaces) {
	                System.out.print(" ");
	                j++;
	            }
	            
	            // Print stars
	            int k = 0;
	            while (k < stars) {
	                System.out.print("* ");
	                k++;
	            }
	            
	            System.out.println(); // Move to the next line
	            i++;
	        }
	    }
	}
