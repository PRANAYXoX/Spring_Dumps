package spring.beanValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import spring.beans.Employee;

public class MyValidator implements Validator {

	@Override
	public boolean supports(Class cls) {
		boolean b=Employee.class.equals(cls);
		return b;
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)arg0;
		if(emp.getName().equals("")) {
			errors.rejectValue("name", "key_emp_name", "Name cannot be empty");
		}
		if(emp.getId()==0) {
			errors.rejectValue("id", "key_ID", "ID cannot be 0");
		}
		if(emp.getAge()<18) {
			errors.rejectValue("age", "key_AGE", "Age cannot be less than 18");
		}
	}

}
