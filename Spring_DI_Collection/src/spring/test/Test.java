package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Student std=(Student)context.getBean("student");
		std.display();
		
	}

}
