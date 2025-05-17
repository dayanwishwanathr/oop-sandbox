package Tutorial02;

import java.util.Scanner;

class Marks {
	
	int mark1,mark2, mark3;
	double avg;
	
	Marks(){
		this.mark1=0;
		this.mark2=0;
		this.mark3=0;
	}
	
	public void inputMarks() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Mark 1: ");
		this.mark1=input.nextInt();
		System.out.println("Enter Mark 2: ");
		this.mark2=input.nextInt();
		System.out.println("Enter Mark 3: ");
		this.mark3=input.nextInt();
		
	}
	
	public void calMarks() {
		avg= (mark1+mark2+mark3) / 3;
		
		
	}
	
	
	
}

public class StdMarks {

	public static void main(String[] args) {
		
		
		
		
		
		
	}

}
