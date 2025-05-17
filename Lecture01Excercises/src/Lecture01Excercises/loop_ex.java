package Lecture01Excercises;

import java.util.Scanner;

public class loop_ex {

	public static void main(String[] args) {
		
		int num;
		int evenCount = 0 , oddCount = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter number: ");
			num= input.nextInt();
			
		if(num % 2 == 0) {
			System.out.println(num+" 12is Even");
			evenCount++;
		} else {
			System.out.println(num+" is Odd");
			oddCount++;
		}
		
		}
			System.out.println("Entered Even num Count "+evenCount);
			System.out.println("Entered Odd num Count "+oddCount);
	}

}
