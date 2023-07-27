package sample.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sample.bean.SampleBean;

public class Test {
	
	public static void main(String[] args) {
		Resource res=new ClassPathResource("/sample/resource/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		SampleBean sb=(SampleBean)factory.getBean("hb");
		sb.display();
	}

}
