package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.beans.Bean_1;
import spring.resources.SpringConfigFile;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Bean_1 b1=(Bean_1) context.getBean("Sample_1");
		b1.display();
	}

}
