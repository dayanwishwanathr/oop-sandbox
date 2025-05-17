package LabSheet02;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Dayan","Colombo","IT21241");
		
		s1.showDetails();
		System.out.println();
		
		PartTimeStudent ps1 = new PartTimeStudent("Wishwanath","Kurunagala","IT213221",6.5f);
		
		ps1.showDetails();
		
	}
	
	

}
