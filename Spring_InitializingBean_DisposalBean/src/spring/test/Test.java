package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.JavaBean;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		JavaBean bean=(JavaBean)context.getBean("jb");
		bean.display();
		context.registerShutdownHook();
	}

}
