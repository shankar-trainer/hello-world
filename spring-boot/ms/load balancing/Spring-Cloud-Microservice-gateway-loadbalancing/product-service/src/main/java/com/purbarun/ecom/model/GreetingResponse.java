package com.purbarun.ecom.model;

public class GreetingResponse {
	private String greeting;
	private String instanceid;
	private int port;
	private String url;
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getInstanceid() {
		return instanceid;
	}
	public void setInstanceid(String instanceid) {
		this.instanceid = instanceid;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
