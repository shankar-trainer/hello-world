package com.packt.bestpractices.smell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.packt.bestpractices.smell.dto.Message;

public class MessagingServiceImpl implements MessagingService {

	Map<String, List<Message>> database= new HashMap<String, List<Message>>();
	@Override
	public String publish(Object message) {
		String jmsId = "JMS:"+System.currentTimeMillis();
		List<Message> msgList = new ArrayList<Message>();
		Message msg = new Message();
		msg.setEventType(1);
		msg.setHeader("<messageId>"+jmsId+"</messageId>");
		msg.setJmsMessageID(jmsId);
		msg.setPayload(null);
		msgList.add(msg);
		
		msg = new Message();
		msg.setEventType(2);
		msg.setHeader("<messageId>"+jmsId+"</messageId>");
		msg.setJmsMessageID(jmsId);
		msg.setPayload(message);
		msgList.add(msg);
		
		msg = new Message();
		msg.setEventType(3);
		msg.setHeader("<messageId>"+jmsId+"</messageId>");
		msg.setJmsMessageID(jmsId);
		msg.setPayload(null);
		msgList.add(msg);
		
		database.put(jmsId, msgList);
		
		return jmsId;
	}

	@Override
	public List<Message> retrieveByMessageId(String jmsMessageId) {
		List<Message> list = database.get(jmsMessageId);
		return list;
	}

}
