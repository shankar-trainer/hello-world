package org.com.model;

public class User {

	private int uid;
	private String uname;
	private String ulocation;
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ulocation=" + ulocation + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUlocation() {
		return ulocation;
	}
	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}
	
	
	
	
}
