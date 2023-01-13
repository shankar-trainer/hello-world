package org.audintel.model;

import lombok.Data;

@Data
public class User {

	private long userId;
	private String userName;
	private String userLocation;
	private Address userAddress;

}
