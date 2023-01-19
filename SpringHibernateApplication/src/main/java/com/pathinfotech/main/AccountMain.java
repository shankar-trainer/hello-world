package com.pathinfotech.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pathinfotech.dao.AccountDaoImpl;
import com.pathinfotech.model.Account;

public class AccountMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		AccountDaoImpl bean = ctx.getBean(AccountDaoImpl.class);
		
		Account account=new Account();
		account.setActId(233221);
		account.setActName("ramesh kumar");
		account.setActSalary(12000);
		
		
		if(bean.addAccount(account))
			System.out.println("Record added");
		System.out.println("all records ");
		for(Account a:bean.getAllAccount())
			System.out.println(a.getActId()+"\t"+a.getActName()+"\t"+a.getActSalary());
		
		Account searchAccount = bean.searchAccount(1);
		if(searchAccount!=null) {
			System.out.println("Found ");
			System.out.println(searchAccount.getActId()+"\t"+searchAccount.getActName()+"\t"+searchAccount.getActSalary());
		}
	}
}
