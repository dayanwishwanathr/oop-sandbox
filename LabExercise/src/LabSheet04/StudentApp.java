package LabSheet04;

public class StudentApp {

	public static void main(String[] args) {

		Student []arr = new Student[5];
		
		arr[0]= new Student("Alice", "IT", "0871234567");
		arr[1]= new Student("Bob", "CS", "0572345678");
		arr[2]= new Student("Bob", "CS", "0472345678");
		
		arr[3]= new Student();
		arr[3].setName("Dayan");
		arr[3].setDegree("SE");
		arr[3].setMobile("0545464646");
		
		arr[4]= new Student();
		arr[4].setName("Wishwanath");
		arr[4].setDegree("IT");
		arr[4].setMobile("546548687");
		
//		arr[0].print();
//		arr[1].print();
//		arr[2].print();
//		
//		System.out.println(arr[1].getNextStudentID());
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Student " + (i + 1)+" ");
			arr[i].print();
		}
		
	}

}
