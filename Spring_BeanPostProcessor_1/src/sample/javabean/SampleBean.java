package sample.javabean;

public class SampleBean {
	
	private String data_1;

	public String getData_1() {
		return data_1;
	}

	public void setData_1(String data_1) {
		this.data_1 = data_1;
	}
	
	public void custInit() {
		data_1="Sample Data";
	}
	
	public void display() {
		System.out.println("\nDATA:"+data_1);
	}
}
