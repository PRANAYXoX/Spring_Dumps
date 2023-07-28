package sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bean.JavaBean;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/sample/resource/applicationContext.xml");
		JavaBean bean=(JavaBean)context.getBean("hb");
		bean.display();
		context.registerShutdownHook();
	}

}
