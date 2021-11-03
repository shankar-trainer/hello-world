package org.capg.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank {
	private int bankRegNo;
	private String bankName;
	private String bankLocation;

	@Autowired
	@Qualifier("manager2")
	private Manager manger;

	public int getBankRegNo() {
		return bankRegNo;
	}

	public void setBankRegNo(int bankRegNo) {
		this.bankRegNo = bankRegNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public Manager getManger() {
		return manger;
	}

	public void setManger(Manager manger) {
		this.manger = manger;
	}

}
