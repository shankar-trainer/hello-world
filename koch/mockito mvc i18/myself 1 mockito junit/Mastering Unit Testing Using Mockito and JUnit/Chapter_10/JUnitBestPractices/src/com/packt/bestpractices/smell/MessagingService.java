package com.packt.bestpractices.smell;

import java.util.List;

import com.packt.bestpractices.smell.dto.Message;

public interface MessagingService {
	String publish(Object message);
	List<Message> retrieveByMessageId(String jmsMessageId);
}
