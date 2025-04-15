package com.packt.bestpractices.smell;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.packt.bestpractices.smell.dto.Message;

@RunWith(MockitoJUnitRunner.class)
public class MessagingServiceTest {
 
	MessagingService service = new MessagingServiceImpl();
	
	@Test
	public void logs_messages() throws Exception {
		String msgId = service.publish(new String("hello world"));
		for(Message msg:service.retrieveByMessageId(msgId)) {
			if(msg.getEventType() == 2) {
				assertEquals("hello world", msg.getPayload());
				break;
			}
		}
	}
}
