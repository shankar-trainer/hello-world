package com.example.model;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

public class Account extends ActionSupport {

	private int accountId;
	private String accountName;
	private String accountLocation;

	@RequiredFieldValidator(message = "id is blank")
	//@IntRangeFieldValidator(message = "Id  must be in between 1000 and 10000", min = "1000", max = "10000")
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@RequiredFieldValidator(message = "account name  is blank")
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@RequiredFieldValidator(message = "account location  is blank")
	public String getAccountLocation() {
		return accountLocation;
	}

	public void setAccountLocation(String accountLocation) {
		this.accountLocation = accountLocation;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

}
