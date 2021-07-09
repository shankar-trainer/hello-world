package com.cts.database;

public class SingletonMain {

	public static void main(String[] args) {
		//SingletonEx ex=new SingletonEx();
		
		SingletonEx ex1=SingletonEx.getSingletonEx();
		ex1.setName("abc");
		SingletonEx ex2=SingletonEx.getSingletonEx();
		ex2.setName("xyz");
		System.out.println(ex1.getName());
		System.out.println(ex2.getName());
		
	}
}
