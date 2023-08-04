package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Bean_1;

public class Test {
		
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("/spring/resources/applicationContext.xml");
		context.start();
		Bean_1 b_1=(Bean_1)context.getBean("b1");
		b_1.display();
	}
}
