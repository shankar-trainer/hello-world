package com.pkg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ExampleAction extends Action
{
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception{
		ExampleForm exampleForm = (ExampleForm) form;
		System.out.println(exampleForm.getName());
		System.out.println(exampleForm.getAge());
			return mapping.findForward("success");
	}
}
