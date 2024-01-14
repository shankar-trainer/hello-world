package com.coforge.tightcoupling;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
	private int id;
	private String name;
	private HomeAddress h_address;
	private OfficeAddress o_address;

	public static void main(String[] args) {

		User user = new User();
		user.setId(676767);
		user.setName("suresh kumar");

		HomeAddress address = new HomeAddress();
		user.setH_address(address);

		OfficeAddress address1 = new OfficeAddress();
		user.setO_address(address1);

		System.out.println("user data " + user);
		user.getH_address().addressDetail();
		user.getO_address().addressDetail();
	}
}

class HomeAddress {
	void addressDetail() {
		System.out.println(" office address");
	}
}

 
class OfficeAddress {
	void addressDetail() {
		System.out.println(" office address");
	}
}
