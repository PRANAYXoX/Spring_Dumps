package spring.beans;

public class Bean_1 {
	
	private String data1;
	private long data2;
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public long getData2() {
		return data2;
	}
	public void setData2(long data2) {
		this.data2 = data2;
	}
	
	public void display() {
		System.out.println("\nBEAN1:\nDATA1:"+data1+"\nDATA2:"+data2);
	}

}
