package com.cts.database;

public class SingletonEx {
	static SingletonEx single;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SingletonEx() {

	}

	public static SingletonEx getSingletonEx() {
		if (single == null)
			single = new SingletonEx();
		return single;
	}

}
