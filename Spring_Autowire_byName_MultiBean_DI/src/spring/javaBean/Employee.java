package spring.javaBean;

public class Employee {
	
	private String name;
	private String empID;
	
	private Skills skills;
	private BaseLocation base;
	
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
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public BaseLocation getBase() {
		return base;
	}
	public void setBase(BaseLocation base) {
		this.base = base;
	}
	
	public void display() {
		System.out.println("NAME:"+name+"\nEMP-ID:"+empID);
		System.out.println("SKILLS:"+skills.getSubjects());
		System.out.println("BASE_LOCATION:"+base.getLocation());
	}
	

}
