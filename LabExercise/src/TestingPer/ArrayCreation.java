package TestingPer;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		sc.nextLine(); // 👈 this clears the leftover newline

		System.out.print("Enter a sentence: ");
		String line = sc.nextLine(); // now reads your actual sentence

		System.out.println("You entered: " + line);

		
		int []num = new int [3];
		num [0] = (int)32.56f;
		num [1] = 3;
		num [2] = 5;
		
		
		//int num[5]  = {1,2,3,4};
    	
    	System.out.println(num[0]);
    	System.out.println(num[1]);
    	System.out.println(num[2]);
    	
    	
    	

    	
	}

}
