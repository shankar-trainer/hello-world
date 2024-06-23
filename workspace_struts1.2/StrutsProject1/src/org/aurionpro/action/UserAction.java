package org.aurionpro.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.aurionpro.form.UserForm;

public class UserAction  extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm=(UserForm) form;
	
		//float salary = userForm.getSalary();
	
		if(userForm.getId()<=0)
			throw new Exception("invalid id");
		else if(userForm.getName()==null || userForm.getName().length()==0)
			throw new Exception("invalid name");
		
		else if(userForm.getSalary()<=0)
			throw new Exception("salary is invalid");
		
		float salary = Float.parseFloat(request.getParameter("salary"));
		float gross_salary=salary-(salary*0.05f);
		
		//request.setAttribute("uform", userForm);
		request.setAttribute("gsalary", gross_salary);
		
		return mapping.findForward("success");
	}
}
