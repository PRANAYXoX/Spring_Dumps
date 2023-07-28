package sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bean.SampleBean;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/sample/resource/applicationContext.xml");
		SampleBean sb1=(SampleBean)context.getBean("jb1");
		SampleBean sb2=(SampleBean)context.getBean("jb2");
		System.out.println("\nBEAN 1-\nNAME:"+sb1.getName());
		System.out.println("\nBEAN 1-\nAGE:"+sb1.getAge());
		System.out.println("\n\nBEAN 2-\nNAME:"+sb2.getName());
		System.out.println("\nBEAN 2-\nAGE:"+sb2.getAge());
	}

}
