package com.packt.legacy;

public class Movie {
	private final String name;
	private final String description;

	public Movie(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Movie) {
			return ((Movie) arg0).getName().equals(name) &&  ((Movie) arg0).getDescription().equals(description);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
