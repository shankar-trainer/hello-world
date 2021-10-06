package org.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="WalletUser")
public class WalletUser {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
	//@SequenceGenerator(name="seq1", sequenceName = "user_seq", initialValue=1000)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="UserId")
	private int UserId;
	
	@Column(name="UserName")
	private String UserName;
	
	@Column(name="UserPassword")
	private String Password;
	
	@Column(name="AadhaarNo")
	private long AadhaarNo;
	
	@Column(name="PhoneNumber")
	private long PhoneNumber;
	
	@Column(name="LoginName")
	private String LoginName;
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "walletUser")
	@JsonManagedReference
	private WalletAccount walletAccount;

	public int getUserId() {
		return UserId;
	}

	public long getAadhaarNo() {
		return AadhaarNo;
	}

	public void setAadhaarNo(long aadhaarNo) {
		AadhaarNo = aadhaarNo;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public WalletAccount getWalletAccount() {
		return walletAccount;
	}

	public void setWalletAccount(WalletAccount walletAccount) {
		this.walletAccount = walletAccount;
	}

	@Override
	public String toString() {
		return "WalletUser [UserId=" + UserId + ", UserName=" + UserName + ", Password=" + Password + ", AadhaarNo="
				+ AadhaarNo + ", PhoneNumber=" + PhoneNumber + ", LoginName=" + LoginName + ", walletAccount="
				+ walletAccount + "]";
	}

	
}
