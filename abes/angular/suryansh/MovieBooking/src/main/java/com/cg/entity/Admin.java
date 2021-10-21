package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adminId;
	private String adminName;
	private String adminPassword;
	private String adminContact;

	public Admin() {

	}

	public Admin(String adminName, String adminPassword, String adminContact) {
		super();
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminContact = adminContact;
	}

//	Generating Getters and Setters methods 
	public String getUserId() {
		return adminId;
	}

	public void setUserId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getadminPassword() {
		return adminPassword;
	}

	public void setadminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminContact=" + adminContact + "]";
	}

}
