package pooky.projects.beans;

import org.springframework.stereotype.Component;

import pooky.projects.MessageService;

@Component
public class MockMessageService2 implements MessageService {
	
	@Override
	public String getMessage() {
		return "Mock service 2";
	}

}
