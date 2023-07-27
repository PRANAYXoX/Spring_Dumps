package sample.bean;

public class SampleBean {
	
	private String name;
	private int id;
	
	static {
		System.out.println("\nINITIATING BEAN\n");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("\nNAME :: "+name+"\nID :: "+id);
	}

}
