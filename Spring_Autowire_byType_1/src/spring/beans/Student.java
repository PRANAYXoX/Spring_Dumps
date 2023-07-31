package spring.beans;

public class Student {
	
	private String name;
	private long id;
	private Subjects subjects;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public void display() {
		System.out.println("NAME:"+name+"\nID:"+id);
		System.out.println("SUBJECTS:"+subjects.getSubjects());
	}
	

}
