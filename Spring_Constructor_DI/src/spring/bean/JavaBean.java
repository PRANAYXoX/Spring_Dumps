package spring.bean;

public class JavaBean {
	
	private String name;
	private int roll;
	private String id;
	
	JavaBean(String name, String id, int roll){
		this.name=name;
		this.id=id;
		this.roll=roll;
	}
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public String getId() {
		return id;
	}
	
	public void display() {
		System.out.println("\nNAME:"+name+"\nROLL:"+roll+"\nID:"+id);
	}
	

}
