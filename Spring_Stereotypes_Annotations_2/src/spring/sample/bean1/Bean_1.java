package spring.sample.bean1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Bean_1 {
	
	@Value("Data_1")
	private String d1;
	@Value("9012390")
	private long d2;
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public long getD2() {
		return d2;
	}
	public void setD2(long d2) {
		this.d2 = d2;
	}
	
	public void display() {
		System.out.println("\nD1:"+d1+"\tD2:"+d2);
	}
	
	

}
