package com.packt.bestpractices.indirecttesting;

public class Facade {
	private final StringUtil utility;

	public Facade(StringUtil utility) {
		this.utility = utility;
	}

	public Object doSomething(Object o) {
		if (o instanceof String) {
			return utility.format((String) o);
		}

		if (o instanceof Integer) {
			return Integer.MIN_VALUE;
		}

		return null;
	}
}
