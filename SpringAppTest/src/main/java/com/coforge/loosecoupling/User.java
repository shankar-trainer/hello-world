package com.coforge.loosecoupling;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

interface Address {
	void addressDetail();
}

@Setter
@Getter
@ToString
public class User {

	private int id;
	private String name;
	private Address address1;
 
	public static void main(String[] args) {
		 
		User user=new User();
		user.setId(676776);
		user.setName("sudhir kumar");
		
		user.address1=new HomeAddress();
		System.out.println(user.getId()+"\t"+user.getName());
		user.address1.addressDetail();
		
		user.address1=new OfficeAddress();
		System.out.println(user.getId()+"\t"+user.getName());
		user.address1.addressDetail();
	}
}

 
class HomeAddress implements Address {

	@Override
	public void addressDetail() {
		System.out.println(" office address");
	}
}
 
class OfficeAddress implements Address {
	
	@Override
	public void addressDetail() {
		System.out.println("home  address");
	}
}
