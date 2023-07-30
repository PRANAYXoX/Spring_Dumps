package sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.javabean.*;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/sample/resource/applicationContext.xml");
		Bean_1 b1=(Bean_1)context.getBean("b1");
		Bean_2 b2=(Bean_2)context.getBean("b2");
		
		b1.display();
		System.out.println("\n-------------------------\n");
		b2.display();
	}

}
