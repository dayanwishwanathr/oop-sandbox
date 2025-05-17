package LabSheet01;

public class Exercise01 {

	public static void main(String[] args) {
		
		int miles;
		int yards;
		double kilometers;
			
		
		miles = 26;
		yards = 385;
		
		kilometers =  (1.609 * miles) + ((yards/1760) *1.609);
		
		System.out.println(kilometers);
		
		
	}

}
