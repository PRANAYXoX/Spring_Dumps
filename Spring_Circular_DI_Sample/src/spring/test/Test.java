package spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.javaBean.*;
public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Bean_2 b2=(Bean_2)context.getBean("b2");
		Bean_1 b1=(Bean_1)context.getBean("b1");
		
		System.out.println("BEAN_1:"+b1);
		System.out.println("BEAN_2:"+b2);
	}

}
