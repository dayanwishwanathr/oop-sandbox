package Lecture01Excercises;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		
		int length;
		int width;
		int perimeter;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("length: ");
		length = myScanner.nextInt();
		System.out.print("Width: ");
		width= myScanner.nextInt();
		
		perimeter = (width+ length) *2;
		
		System.out.println("Perimeter is : "+perimeter);
	}

}
