package spring.bean;

public class Student {
	
	private String name;
	private int roll;
	private String marks;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void display() {
		System.out.println("\nNAME::"+name+"\nROLL::"+roll+"\nMARKS::"+marks);
		System.out.println("\nCITY:"+address.getCity()+"\nSTATE:"+address.getState()+"\nPIN:"+address.getPin());
	}

}
