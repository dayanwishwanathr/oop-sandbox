package Lecture02;

import java.util.Scanner;

class Employee {
	
	protected String EmpId;
	protected String name;
	protected String address;
	
	public Employee() {
		
	}
	
	public Employee(String EmpId, String name, String address) {	
	
		this.EmpId=EmpId;
		this.name=name;
		this.address=address;
		
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String EmpId) {
		this.EmpId = EmpId;
	}

	
	public void Read() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Emp ID: ");
		this.EmpId= input.next();
		System.out.print("Enter Emp Name: ");
		this.name= input.next();
		System.out.print("Enter Emp Address: ");
		this.address= input.next();
		
	}
	
	
	public void Print() {

		System.out.println("\nEmployee Details:");
        System.out.println("Emp ID: " + EmpId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
	}
	
	
}

class Manager extends Employee{
	
	protected int DepNum;
	protected String DepName;
	
	public Manager (String EmpId, String name, String address, int DepNum, String DepName) {
		super(EmpId, name, address);
		this.DepNum=DepNum;
		this.DepName=DepName;
		
	}
	
	@Override
	public void Print() {
		super.Print();
		System.out.println("Department Number: " + DepNum);
        System.out.println("Department Name: " + DepName);
		
	}
	
	
}


public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee Emp1 = new Employee();
		Employee Emp2 = new Employee("E102", "John Doe", "Colombo");
		
		Emp1.Read();
		
		Emp1.Print();
		Emp2.Print();
		
		Manager mgr1 = new Manager("M201", "Alice Brown", "Kandy", 101, "HR");
        Manager mgr2 = new Manager("M202", "David Smith", "Galle", 102, "IT");
        
        mgr1.Print();
        mgr2.Print();
        
        
        
	}

}
