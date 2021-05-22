package org.cts.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {
	private int uId;
	private String name;
	private Department department;
	
	public void setuId(int uId) {
		this.uId = uId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@PostConstruct
	public void init() {
	
		System.out.println("init called ");
	} 
	
	@PreDestroy
	 void clean() {
	
	  System.out.println("clean up called ");	 
	 }
	
	@Autowired
	public User(int uId, String name, @Qualifier("dept2")
	 Department department) {
		super();
		this.uId = uId;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", \n\tdepartment=" + department + "]";
	}

}
