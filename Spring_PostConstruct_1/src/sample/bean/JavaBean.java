package sample.bean;

import javax.annotation.PostConstruct;

public class JavaBean {
	
	private String d1;
	private float d2;
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		System.out.println("Setter Initiatede!");
		this.d1 = d1;
	}
	public float getD2() {
		return d2;
	}
	public void setD2(float d2) {
		this.d2 = d2;
	}
	
	@PostConstruct
	public void init() {
		
		System.out.println("\nPOST CONSTRUCT INITIATED!\n");
		d1="jhgjhgjhgjh";
		d2=45000;
		
	}
	
	public void display() {
		System.out.println("\nD1::"+d1+"\nD2::"+d2);
	}
	

}
