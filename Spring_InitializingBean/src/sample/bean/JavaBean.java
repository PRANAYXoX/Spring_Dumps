package sample.bean;

import org.springframework.beans.factory.InitializingBean;

public class JavaBean implements InitializingBean {
	
	private String data1;
	private int data2;
	
	
	
	public String getData1() {
		return data1;
	}



	public void setData1(String data1) {
		this.data1 = data1;
	}



	public int getData2() {
		return data2;
	}



	public void setData2(int data2) {
		System.out.println("\nsetter");
		this.data2 = data2;
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nAfer Properties");
		data1="Pranay";
		data2=45000;
	}
	
	public void display() {
		System.out.println("\nDATA 1 ::"+data1+"\nDATA2 ::"+data2);
	}

}
