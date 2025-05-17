package CollactionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Crate an array list
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Initial size of al: "+al.size());

		
		//Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
	
		al.add(1, "A2");
		
		System.out.println("size of al after the addition: "+al.size());

		
		// Display the array list
		System.out.println("Contents of al:"+al);
		
		//Remove elements from the array list
		al.remove("F");
		al.remove(2);
		
		System.out.println("size of al after the deletion: "+al.size());
		
		System.out.println("Contents of al:"+al);
		
		for (int i=0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}

}
