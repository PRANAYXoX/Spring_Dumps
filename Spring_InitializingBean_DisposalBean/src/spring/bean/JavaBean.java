package spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class JavaBean implements InitializingBean, DisposableBean {
	
	private String d1;
	private int d2;
	
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
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EXECUTING OBJECT DESTRUCTION!\n");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("\nEXECUTING AFTER PROPERTIES SET\n");
		// TODO Auto-generated method stub
		d1="SAMPLE STRING";
		d2=504;
	}
	
	public void display() {
		System.out.println("\nD!::"+d1+"\nD2::"+d2);
	}
	
	
}
