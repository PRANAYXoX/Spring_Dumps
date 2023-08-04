package spring.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("-EVENT GENERATED!");
	}

}
