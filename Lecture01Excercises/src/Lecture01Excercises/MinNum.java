package Lecture01Excercises;

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int minNum, maxNum;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter 1st integer ");
		num1= input.nextInt();
		System.out.print("Enter 2nd integer ");
		num2= input.nextInt();
		System.out.print("Enter 3rd integer ");
		num3= input.nextInt();
		
		minNum = Math.min(num1, Math.min(num2, num3));
		maxNum= Math.max(num1, Math.max(num2, num3));
		
		
		System.out.println("Min Num is "+minNum);
		System.out.println("Max Num is "+maxNum);
	}

}
