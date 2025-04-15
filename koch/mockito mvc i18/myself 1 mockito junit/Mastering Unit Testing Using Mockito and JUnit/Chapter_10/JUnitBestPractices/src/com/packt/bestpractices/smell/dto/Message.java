package com.packt.bestpractices.smell.dto;

public class Message {
	private String jmsMessageID;
	private String header;
	private Object payload;
	private int eventType;

	public String getJmsMessageID() {
		return jmsMessageID;
	}

	public void setJmsMessageID(String jmsMessageID) {
		this.jmsMessageID = jmsMessageID;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
}
