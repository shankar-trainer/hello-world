package org.aurionpro.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CustomerForm extends ActionForm {

	private int customerId;
	private String customerName;
	private float customerSalary;

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

	public float getCustomerSalary() {
		return customerSalary;
	}

	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}
	
	//ActionErrors errors;
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
	ActionErrors errors=new ActionErrors();
	
		if(getCustomerId()<=0){
			errors.add("customerId", new ActionMessage("id.required"));
		}
		else if(getCustomerName()==null || getCustomerName().length()==0){
			
			errors.add("customerName", new ActionMessage("name.required"));
		}
		else if(getCustomerSalary()<=0){
			errors.add("customerSalary", new ActionMessage("salary.required"));
		}
		
		return errors;
	}
	
}
