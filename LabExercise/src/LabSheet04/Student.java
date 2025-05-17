package LabSheet04;

public class Student {

	private static int max = 100;
	private int studentID = max++;
	private String name;
	private String degree;
	private String mobile;
	
	public Student() {
		
	}
	
	public Student(String name, String degree,String mobile) {
		
		this.name=name;
		this.degree=degree;
		this.mobile=mobile;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("studentID "+studentID+"  name "+name+"  degree "+degree+ "  mobile "+mobile);
	}
	
	public static int getNextStudentID() {
		return max;
		
	}
	
	
}
