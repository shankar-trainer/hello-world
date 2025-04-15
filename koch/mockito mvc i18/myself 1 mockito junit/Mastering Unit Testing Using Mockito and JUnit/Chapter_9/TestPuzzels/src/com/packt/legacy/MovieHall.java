package com.packt.legacy;


public class MovieHall {
	private final String name;
	private final int capacity;

	public MovieHall(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

}
