package sample.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.util.*;
import sample.bean.SampleBean;

public class Test {
		public static void main(String[] args) {
			Resource res=new ClassPathResource("/sample/resource/applicationContext.xml");
			BeanFactory factory = new XmlBeanFactory(res);
			Scanner s= new Scanner(System.in);
			SampleBean bean=(SampleBean)factory.getBean("hb");
			System.out.println("\nNAME:");
			String name=s.nextLine();
			System.out.println("\nEMP-ID ::");
			String id=s.nextLine();
			System.out.println("\nSALARY ::");
			int sal=s.nextInt();
			bean.setEmpID(id);
			bean.setName(name);
			bean.setSalary(sal);
			bean.display();
		}
}
