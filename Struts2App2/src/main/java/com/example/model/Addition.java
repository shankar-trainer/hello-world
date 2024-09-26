package com.example.model;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Addition  extends ActionSupport implements SessionAware {

	private int n1;
	private int n2;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	Map<String, Object> map;
	@Override
	public void setSession(Map<String, Object> session) {
		map=session;
		int x=Integer.parseInt("n1");
		int y=Integer.parseInt("n2");
		map.put("sum", new Integer(x+y).toString());
	}
}
