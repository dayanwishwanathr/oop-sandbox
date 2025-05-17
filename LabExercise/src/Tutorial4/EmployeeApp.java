package Tutorial4;

abstract class Employee {
	
	protected String name;
	protected int employeeId;
	 
	public Employee(String name, int employeeId){
	 
		this.name = name;
		this.employeeId = employeeId;
	 
	}
	 
	 public abstract double calculateSalary();
	 public abstract void displayDetails();
	
}

class Manager extends Employee{
	
	double Salary;
	
	public Manager(String name, int employeeId, double Salary) {
		super(name, employeeId);
		this.Salary=Salary;
	}

	public double calculateSalary () {
		return Salary;
		
	}
	
	public void displayDetails () {
		System.out.println("Manager's Name: "+name+" MangID: "+employeeId+" Manager sal: $"+calculateSalary());
	}
	
}

class Developer extends Employee {

	private double hourlyWage;
	int NoHWork=6;

	public Developer(String name, int employeeId, double hourlyWage) {
		super(name, employeeId);
		this.hourlyWage=hourlyWage;
		
	}

	@Override
	public double calculateSalary() {
		return hourlyWage*NoHWork;
	}

	@Override
	public void displayDetails() {
		System.out.println("Developer's Name: "+name+" DevID: "+employeeId+" Dev sal: $"+calculateSalary());
		
	}
	
	
	
}



public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee m = new Manager("Dayan", 1000, 90000.0);
		Employee d = new Developer("Rathnayake", 2000, 10000);
		
		m.displayDetails();
		d.displayDetails();

		
	}

}
