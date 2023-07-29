package spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Student;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Student std=(Student)context.getBean("std");
		std.display();
		context.registerShutdownHook();	
	}

}
