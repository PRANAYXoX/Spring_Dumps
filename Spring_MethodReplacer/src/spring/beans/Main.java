package spring.beans;

import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("spring.beans.Calculations");
		Method[] m=c.getDeclaredMethods();
		for(Method i:m) {
			System.out.println(i);
		}
	}

}
