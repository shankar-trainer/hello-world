package com.packt.bestpractices.invalidinput;

public class Adder {

	public Integer add(Integer first, Integer second) {
		if (first == null || second == null) {
			throw new IllegalArgumentException("Invalid inputs first=[" + first
					+ "], second=[" + second + "]");
		}

		return first + second;
	}
}
