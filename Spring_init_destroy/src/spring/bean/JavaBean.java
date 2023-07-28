package spring.bean;

public class JavaBean {
	
	private String d1;
	private int d2;
	
	public JavaBean(){
		System.out.println("\nConstructor Initiated!\n");
	}
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public int getD2() {
		return d2;
	}
	public void setD2(int d2) {
		this.d2 = d2;
	}
	
	public void customInit() {
		d1="Sample Text";
		d2=4500;
		System.out.println("\nBean Initialized!\n");
	}
	
	public void destroyBean() {
		d1=null;
		d2=0;
		System.out.println("\nBean Destroyed!");
	}
	
	public void display() {
		System.out.println("\nD1::"+d1+"\nD2::"+d2);
	}
	
}
