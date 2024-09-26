package com.montran.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User  implements Externalizable{

	private int userId;
	private String userName;
	private String userLocation;
	private static String userCountry;
	
	public User(int userId, String userName, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}
	public User() {
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userLocation=" + userLocation + ", userCountry=" + userCountry+"]";
	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {

		System.out.println("read External called");
		
		this.userId=arg0.readInt();
		this.userName=(String) arg0.readObject();
		this.userLocation=(String) arg0.readObject();
		this.userCountry=(String) arg0.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
                arg0.writeInt(this.userId);
                arg0.writeObject(this.userName);
                arg0.writeObject(this.userLocation);
                arg0.writeObject(this.userCountry);

		System.out.println("write external called ");
	}
}
