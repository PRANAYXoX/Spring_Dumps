package spring.beans;

public class Student {
	
	private String name;
	private String stdId;
	private int age;
	
	private Subject subject;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStdId() {
		return stdId;
	}
	
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Subject Setters and Getters
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//Display
	public void display() {
		System.out.print("\nNAME:"+name+"\nstdId:"+stdId+"\nAGE:"+age);
		System.out.print("\nSubjects:"+subject.getSubject());
	}
}