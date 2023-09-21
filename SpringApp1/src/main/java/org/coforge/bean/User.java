package org.coforge.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *  
 * @author Training
 *   This is user bean class with constructor dependency
 */
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

	
	private int userId;
	private String  userName;
	private  float userSalary;
	
	/**
	 *  init-method in beans.xml 
	 *  <br>is used to initilise the bean instance 
	 *  <br>after setter called
	 *    
	 */
	public void init() {
		this.userId=98988;
		this.userName="parvin kumar";
		this.userSalary=77000;
		System.out.println("init called");
	}
	
	public void destroy() {
		System.out.println("destroy called");
	}
	
	
	
}
