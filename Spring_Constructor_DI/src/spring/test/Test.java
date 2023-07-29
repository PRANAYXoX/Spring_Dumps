package spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.*;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		JavaBean bean=(JavaBean)context.getBean("std");
		bean.display();
	}

}
