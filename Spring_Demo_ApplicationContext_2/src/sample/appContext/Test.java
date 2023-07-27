package sample.appContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
import sample.bean.SampleBean;

public class Test {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("/sample/resource/applicationContext.xml");
		SampleBean sb=(SampleBean)context.getBean("jb");
		System.out.println("\nNAME :: ");
		String name=s.nextLine();
		System.out.println("\nID ::");
		int id=s.nextInt();
		sb.setName(name);
		sb.setId(id);
		sb.display();
	}

}
