package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.*;

public class Test {
		
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Bean_1 b1=(Bean_1)context.getBean("b1");
		Bean_2 b2=(Bean_2)context.getBean("b2");
		b1.display();
		System.out.println("-----------------------------------------");
		b2.display();
	}
}
