package com.example.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class StudentIntercepor  implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}

	@Override
	public void init() {
		System.out.println("init called ");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("pre request interceptor  called ");
		String invoke = invocation.invoke();
		System.out.println("post request interceptor  called ");
		return invoke;
	}

}
