package sample.bean;

public class SampleBean {
	
	private String name;
	private String empID;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("\nNAME :: "+name+"\nEMP-ID :: "+empID+"\nSALARY :: "+salary);
	}

}
