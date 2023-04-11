package org.audintel.main;

import org.audintel.model.Address;
import org.audintel.model.User;
import org.audintel.model.UserConfoguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class UserMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(UserConfoguration.class);
		User bean = ctx.getBean(User.class);
		
		User bean1 = ctx.getBean(User.class);
		
		bean1.setUserId(878787);
		bean1.setUserName("sunil kumar");
		bean1.setUserSalary(67000);
		
		Address userAddress = bean1.getUserAddress();
		
		userAddress.setAddrId(8787879);
		userAddress.setAddrStreet("street4");
		userAddress.setAddrCity("sikandarabad");
		userAddress.setAddrState("telengana");
		userAddress.setAddrPin(78787878);
		
		
		System.out.println("User1 data");
		System.out.println(bean.getUserId()+"  "+bean.getUserName()+"\t"+bean.getUserSalary());
		System.out.println("User1 Address");
		System.out.println(bean.getUserAddress());
		
		System.out.println("User2 data");
		
		
		System.out.println(bean1.getUserId()+"  "+bean1.getUserName()+"\t"+bean1.getUserSalary());
		System.out.println("User2 Address");
		System.out.println(bean1.getUserAddress());
			
	}
}
