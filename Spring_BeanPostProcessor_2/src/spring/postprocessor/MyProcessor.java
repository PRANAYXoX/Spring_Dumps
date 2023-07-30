package spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import spring.beans.Student_Official;
import spring.beans.Student_Personal;

public class MyProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		if(obj instanceof Student_Official) {
			System.out.println("POST PROCESSOR!!");
			Student_Official so=(Student_Official)obj;
			String id=((Student_Official) so).getId();
			String name=((Student_Official) so).getName();
			so.setId("X00-"+id);
			so.setName("MR."+name);
			System.out.println("--------------"+so.getId());
			/*String id=((Student_Official) obj).getId();
			String name=((Student_Official) obj).getName();
			((Student_Official) obj).setId("X00"+id);
			((Student_Official) obj).setName("MR."+name);*/
			return so;
		}
		
		else if(obj instanceof Student_Personal) {
			String city=((Student_Personal) obj).getCity();
			String state=((Student_Personal) obj).getState();
			int pin=((Student_Personal) obj).getPin();
			((Student_Personal) obj).setCity("IN"+city);
			((Student_Personal) obj).setState("INDIA"+state);
			((Student_Personal) obj).setPin(pin+800000);
			return obj;
		}else {
			return null;
		}
		//return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		
		return obj;
	}

}
