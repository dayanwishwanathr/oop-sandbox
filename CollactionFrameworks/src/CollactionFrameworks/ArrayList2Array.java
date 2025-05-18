package CollactionFrameworks;

import java.util.ArrayList;

public class ArrayList2Array {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(4);
		al.add(7);
		al.add(2);
		al.add(5);
		al.add(9);
		
		System.out.println(al);
		
//		al.remove(3);
//		System.out.println(al);
		
		// Create Integer array
		Integer ia []= new Integer[al.size()];
		
		
		ia = al.toArray(ia);
		System.out.println(ia);
		
		int sum = 0;
		
		// sum the array
		for (int i=0; i<ia.length; i++) {
			sum= sum+i;
			
			
			System.out.println(sum);
		}
		
		
	}

}
