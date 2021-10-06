package org.com.onlinetest.model;
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
//@Table(name="user4")
public class Users {

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
	private String username;
	private String userpassword;
	
	//@OneToOne
	//@JoinColumn(name="testid")
	private Test usertest;
	
	@OneToOne(targetEntity = Test.class)
	public Test getUsertest() {
		return usertest;
	}
	public void setUsertest(Test usertest) {
		this.usertest = usertest;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getUserId() {
		
		return userid;
	}
	public void setUserId(Long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		//System.out.println("#####username"+username);
		this.username = username;
	}
	
	
	public String getUserPassword() {
		return userpassword;
	}
	public void setUserPassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", usertest="
				+ usertest + "]";
	}
	
	
}
*/
