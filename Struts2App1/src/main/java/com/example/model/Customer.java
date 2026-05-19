package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class Customer extends ActionSupport {

	private int customerId; 
	private  String  customerName;
	private  String  customerLocation;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	@Override
	public String execute() throws Exception {
	    if(getCustomerId()<=0) {
	 //   	addFieldError("customerId","invalid customer id ");
	    	addFieldError("customerId",getText("cst.error.id"));
	    	return INPUT;
	    }
	    else   if(getCustomerName().isEmpty()) {
	    	//addFieldError("customerName","name is blank ");
	    	addFieldError("customerName",getText("cst.error.name"));
	    	return INPUT;
	    }
	    if(getCustomerLocation().isEmpty()) {
	    //	addFieldError("customerLocation","customer location is blank ");
	    	addFieldError("customerLocation",getText("cst.error.location"));
	    	return INPUT;
	    }
	    			
		return SUCCESS;
	}
	
}
