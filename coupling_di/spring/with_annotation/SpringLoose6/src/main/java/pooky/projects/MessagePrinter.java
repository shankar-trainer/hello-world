package pooky.projects;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	
	@Resource(name="mockMessageService2")
    //@Autowired
	
	private MessageService service;
    
	public MessagePrinter() {
		
	}
	
	public MessagePrinter(MessageService mockMessageService) {
        this.service = mockMessageService;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
