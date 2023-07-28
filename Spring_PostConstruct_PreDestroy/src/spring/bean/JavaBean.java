package spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JavaBean {
	
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
	
	@PostConstruct
	public void initialize() {
		System.out.println("\nINITIALIZE OBJECT !\n");
		d1="Sample_String";
		d2=4500;
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("\nBEAN DESTROYED!\n");
	}
	
	public void display() {
		System.out.println("\nD1::"+d1+"\nD2::"+d2);
	}

}
