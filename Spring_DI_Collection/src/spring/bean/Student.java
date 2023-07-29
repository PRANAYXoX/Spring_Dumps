package spring.bean;

import java.util.List;

public class Student {
	
	private String name;
	private int age;
	private String id;
	
	private Subjects subjects;
	
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("\nNAME:"+name+"\nAGE:"+age+"\nID:"+id);
		System.out.println("\nSUBJECTS:-\n");
		List<String> sb=subjects.getSubjects();
		for(String sub:sb) {
			System.out.print(sub+"-");
		}
	}
	
}
