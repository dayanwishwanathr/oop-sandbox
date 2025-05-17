package CollactionFrameworks;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		
		//Crate an array list

		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		//Add elements to the array list.
		al.add("I");
		al.add("am");
		al.add("a");
		al.add("Fking");
		al.add("Pro");
		
		// Display the array list

		System.out.println(al.size());
		System.out.println(al);

		//Remove elements from the array list
		al.remove("Fking");
		
		System.out.println(al.size());
		System.out.println(al);
	
		// print using foreach loop
		for(String str1 : al) {
			System.out.println(str1);
		}
		
	}
	

}
