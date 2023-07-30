package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Student_Official;
import spring.beans.Student_Personal;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Student_Official so=(Student_Official)context.getBean("so");
		so.display();
		Student_Personal sp=(Student_Personal)context.getBean("sp");	
		sp.display();
	}

}
