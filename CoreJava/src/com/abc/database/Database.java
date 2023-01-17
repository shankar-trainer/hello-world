package com.abc.database;

public class Database {

	private String User;
	private String Password;
	
	private Database() {
	}

	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	static Database database;
	public static Database getDatabase() {
	    	if(database==null)
	    		database=new Database();
	return database;    	
	}
	
	
}
