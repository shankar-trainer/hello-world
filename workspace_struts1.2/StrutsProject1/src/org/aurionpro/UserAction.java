package org.aurionpro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UserAction  extends Action{
 @Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	 
	 
	 String target="success";
	 UserForm userForm=(UserForm) form;
	 
	 String name=userForm.getName();
	 int id=userForm.getId();
	float salary=userForm.getSalary();
	 System.out.println("id is "+id);
	 if(id<=0){
		 target="failure";
		 request.setAttribute("error", "id is blank or empty");
	 }
	 
	 else if(name=="" || name==null){
		 target="failure";
		 request.setAttribute("error", "name is blank or empty");
	 }
	 
	 else if(salary<=0){
		 target="failure";
		 request.setAttribute("error", "salary is blank or empty");
	 }
	 
	 else
	 //request.setAttribute("name", name);
	  request.setAttribute("user",userForm);
	 
	return mapping.findForward(target)  ;
}
}
