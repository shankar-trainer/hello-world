package org.aurionpro.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.aurionpro.form.CalculatorForm;

public class CalculatorAction  extends DispatchAction {
	
	public ActionForward addition(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {

		CalculatorForm calculatorForm=(CalculatorForm) form;
		calculatorForm.setMessage("addition method");
		
		System.out.println("addition called");
		return mapping.findForward("success");	}
	
	
	public ActionForward subtraction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		CalculatorForm calculatorForm=(CalculatorForm) form;
		calculatorForm.setMessage("subtraction method");
		System.out.println("subtraction called");
		return mapping.findForward("success");
	}
	
	
	public ActionForward multiplication(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {

		CalculatorForm calculatorForm=(CalculatorForm) form;
		calculatorForm.setMessage("multiplication method");
		System.out.println("multiplication called");
		return mapping.findForward("success");
	}
	
	
	public ActionForward division(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {

		CalculatorForm calculatorForm=(CalculatorForm) form;
		calculatorForm.setMessage("division method");
		System.out.println("division called");
		return mapping.findForward("success");
	}
	

}
