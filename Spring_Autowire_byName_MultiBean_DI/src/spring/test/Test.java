package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.javaBean.*;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Employee emp=(Employee)context.getBean("std");
		emp.display();
	}

}
