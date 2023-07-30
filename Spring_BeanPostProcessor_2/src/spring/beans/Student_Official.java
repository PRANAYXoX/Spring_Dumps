package spring.beans;

public class Student_Official {
	
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void custInit() {
		name="Ronny";
		id="0586";
	}
	
	public void display() {
		System.out.println("\nSO:\nNAME::"+name+"\nID::"+id);
	}

}
