package LabSheet05;

import java.util.InputMismatchException;
import java.util.Scanner;

//Lab Sheet on Try Catch Blocks

public class Ex03Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int maxSubjects;
		int [] marks = new int[5];
		int total=0;
		double avg;

		try {
			
			// 1. Input a value for maxSubjects from keyboard
			System.out.print("Enter maxSubjects: ");
			maxSubjects = sc.nextInt();
	
			
			// 2. Using a for loop input marks
			for(int i = 0; i<maxSubjects; i++) {
				System.out.print("Enter marks: ");
				marks[i] = sc.nextInt();		
				
			}
	
			// 3. Calculate the avg marks
	
			for(int mark : marks) {
				total = total +mark;
				
			}
	
			avg = total/marks.length;
			
			System.out.println(total);
			System.out.println(avg);
			// 4. Use a try catch block to prevent the following run time errors
	
				// (a) Input valid integers to the inputs
				// (b) ArithmeticException division by zero
				// (c) ArrayIndexOutOfBoundsException
	
		} catch (InputMismatchException e) {
			System.err.println(e);
		}catch (ArithmeticException e) {
			System.err.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		
		}finally {
			System.out.println("This code will be gurrentied to run");
		}		
		System.out.println("The end");
		
	}
	
}
