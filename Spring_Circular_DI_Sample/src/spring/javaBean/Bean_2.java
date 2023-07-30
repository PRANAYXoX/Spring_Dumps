package spring.javaBean;

public class Bean_2 {
	
	Bean_2(){
		System.out.println("\nBEAN_2 EXECUTED!\n");
	}
	
	private Bean_1 b1;

	public Bean_1 getB1() {
		return b1;
	}

	public void setB1(Bean_1 b1) {
		this.b1 = b1;
	}
	
}
