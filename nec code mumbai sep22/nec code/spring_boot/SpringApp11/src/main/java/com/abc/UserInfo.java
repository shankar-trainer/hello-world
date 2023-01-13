package com.abc;

import lombok.Data;

@Data
public class UserInfo  implements User{

	private int userId;
	private String userName;
	private String userLocation;
	
	
	
	@Override
	public void getUserInfo() {
	
		System.out.println("\nUser Information");
		System.out.println("user id "+getUserId());
		System.out.println("user name "+getUserName());
		System.out.println("user location "+getUserLocation());
		
	}

}
