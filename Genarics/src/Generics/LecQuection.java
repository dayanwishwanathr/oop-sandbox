package Generics;

import java.util.ArrayList;
import java.util.Collection;

//Write a program to store a list of names, retrieve the names & display on the screen.
//Hint: Use an ArrayList class

public class LecQuection {

	public static void main(String[] args) {

		Collection<String> name = new ArrayList<String>();
		name.add("Dayan");
		name.add("Nimal");
		name.add("Wishwanath");
		
		for (String n : name) {
			System.out.println(n);
		}
		
		
	}

}
