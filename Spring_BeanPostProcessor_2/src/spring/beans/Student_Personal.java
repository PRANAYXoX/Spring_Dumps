package spring.beans;

public class Student_Personal {
	
	private String city;
	private String state;
	private int pin;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void custInit() {
		city="Ranchi";
		state="Jharkhand";
		pin=834005;
	}
	
	public void display() {
		System.out.println("\nSP:\nCITY::"+city+"\nSTATE::"+state+"\nPIN::"+pin);
	}

}
