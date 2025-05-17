package LabSheet02;

public class PartTimeStudent extends Student {

	float workhours;
	
	public PartTimeStudent() {
		
	}
	
	public PartTimeStudent (String name,String address, String studentid,float workhours) {
		super(name, address, studentid);
		this.workhours=workhours;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("workhours is "+this.workhours);
	}
	
	
	
}
