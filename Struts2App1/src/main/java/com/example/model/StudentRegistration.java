package com.example.model;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentRegistration extends ActionSupport implements ModelDriven<Student>, SessionAware {

	Student student;

	public StudentRegistration() {
		student = new Student();
	}

	@Override
	public Student getModel() {
		return student;
	}

	@Override
	public String execute() throws Exception {
		if (student.getRoll() <= 0) {
			addFieldError("roll", "roll is blank");
			return INPUT;
		} else if (student.getName().isEmpty() || student.getName() == null) {
			addFieldError("name", "name is blank");
			return INPUT;
		} else if (student.getMarks() <= 0) {
			addFieldError("marks", "marks is blank");
			return INPUT;
		} else {
			sessionMap.put("schoolName", "delhi public school");
			sessionMap.put("schoolLocation", "laxminagar");
			sessionMap.put("city", "new delhi");
			sessionMap.put("state", "delhi");
			
			return SUCCESS;}
	}

	private SessionMap<String, Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap<String, Object>) session;
	}

}
