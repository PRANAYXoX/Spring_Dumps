package sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bean.SampleBean;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/sample/resource/applicationContext.xml");
		SampleBean bean=(SampleBean)context.getBean("jb");
		bean.display();
		
	}

}
