package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.model.Account;
import com.pathinfotech.model.Department;

public class DepartmentMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
	
		Account act = ctx.getBean("account",Account.class);
		
		System.out.println("account data ");
		System.out.println("\tid "+act.getAccountId());
		System.out.println("\tname "+act.getAccountName());
		System.out.println("\tlocation "+act.getAccountLocation());
		System.out.println("\tstate "+act.getAccountState());
	
		System.out.println("\nDepartment \n");
		Department department = act.getDepartment();
	
		System.out.println("\tdept id "+department.getDepartmentId());
		System.out.println("\tdept name "+department.getDepartmentName());
		System.out.println("\tdept no of employee  "+department.getDepartmentNoOfEmployee());
	}
}
