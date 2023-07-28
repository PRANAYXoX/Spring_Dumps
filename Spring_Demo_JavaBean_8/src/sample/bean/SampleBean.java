package sample.bean;

public class SampleBean {
	
	private String data_1;
	private int data_2;
	
	public SampleBean() {
		System.out.println("Constructor Executed!");
	}
	public String getData_1() {
		return data_1;
	}
	public void setData_1(String data_1) {
		this.data_1 = data_1;
	}
	public int getData_2() {
		return data_2;
	}
	public void setData_2(int data_2) {
		this.data_2 = data_2;
	}
	
	public void display() {
		
		System.out.println("\nDATA 1::"+data_1+"\nDATA_2 ::"+data_2);
	}
	
}
