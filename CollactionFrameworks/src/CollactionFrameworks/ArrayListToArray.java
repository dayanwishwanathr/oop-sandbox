package CollactionFrameworks;


import java.util.*;

class ArrayListToArray {
	public static void main(String args[]) { // Create an array list.
		ArrayList<Integer> al = new ArrayList<Integer>();
			// Add elements to the array list.
		 al.add(1);
		 al.add(2);
		 al.add(3);
		 al.add(4);
		 
		 System.out.println("Contents of al: " + al);
		
		 // Get the array.
		 
		 Integer ia[] = new Integer[al.size()];
		 
		 ia = al.toArray(ia);
		 int sum = 0;
		 
		 // Sum the array.
		 for(int i =0 ; i< ia.length ; i++) {
			 sum += i;
		 System.out.println("Sum is: " + sum);
	
		 }
		 List<Integer> ali = new ArrayList<>();
		 
	     Integer[] arrayname = {1, 2, 3, 4, 5, 6};

	     Collections.addAll(ali, arrayname);

	     System.out.println(ali);

    
}

}