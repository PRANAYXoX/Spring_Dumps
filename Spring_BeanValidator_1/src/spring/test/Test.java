package spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import spring.beanValidator.MyValidator;
import spring.beans.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/spring/resource/applicationContext.xml");
		Employee emp=(Employee)context.getBean("emp");
		emp.display();
		DataBinder binder=new DataBinder(emp);
		binder.addValidators(new MyValidator());
		binder.validate();
		
		BindingResult br= binder.getBindingResult();
		List err= br.getAllErrors();
		System.out.println("--------------------------\n"+err);
	}

}
