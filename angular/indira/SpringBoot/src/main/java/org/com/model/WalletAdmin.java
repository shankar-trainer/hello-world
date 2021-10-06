package org.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WalletAdmin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AdminId")
	private int AdminId;
	
	@Column(name="AdminName")
	private String AdminName;
	
	@Column(name="AdminPassword")
	private String Password;
	
	@Column(name="AadhaarNo")
	private long AadhaarNo;
	
	@Column(name="PhoneNumber")
	private long PhoneNumber;
	
	@Column(name="LoginName")
	private String LoginName;

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public long getAadhaarNo() {
		return AadhaarNo;
	}

	public void setAadhaarNo(long aadhaarNo) {
		AadhaarNo = aadhaarNo;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getLoginName() {
		return LoginName;
	}

	public void setLoginName(String loginName) {
		LoginName = loginName;
	}

	@Override
	public String toString() {
		return "WalletAdmin [AdminId=" + AdminId + ", AdminName=" + AdminName + ", Password=" + Password
				+ ", AadhaarNo=" + AadhaarNo + ", PhoneNumber=" + PhoneNumber + ", LoginName=" + LoginName + "]";
	}
	
	
	
}
