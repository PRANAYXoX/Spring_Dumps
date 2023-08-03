package spring.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodRp implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("METHOD NAME:"+arg1.getName());
		System.out.println("VAL:"+(Integer)arg2[0]);
		return null;
	}

}
