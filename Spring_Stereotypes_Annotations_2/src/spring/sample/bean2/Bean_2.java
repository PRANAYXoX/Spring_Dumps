package spring.sample.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller("myBean")
public class Bean_2 {
	
	@Value("Data Bean_2")
	private String d1;
	@Value("90118956")
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
