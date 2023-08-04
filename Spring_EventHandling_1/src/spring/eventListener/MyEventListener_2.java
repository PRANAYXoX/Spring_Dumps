package spring.eventListener;

import java.util.EventListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.w3c.dom.events.Event;

public class MyEventListener_2 implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("----------CONTAINER STARTED");
	}

}
