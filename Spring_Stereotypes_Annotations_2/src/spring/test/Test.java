package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.sample.bean1.Bean_1;
import spring.sample.bean2.Bean_2;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Bean_1 b1=(Bean_1)context.getBean("bean_1");
		
		Bean_2 b2=(Bean_2)context.getBean("myBean");
		b1.display();
		System.out.println("\n-----------------------------------------\n");
		b2.display();
		
	}

}
