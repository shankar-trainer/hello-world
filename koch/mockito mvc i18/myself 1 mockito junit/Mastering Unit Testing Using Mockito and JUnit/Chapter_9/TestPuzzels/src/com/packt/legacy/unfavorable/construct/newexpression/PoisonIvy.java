package com.packt.legacy.unfavorable.construct.newexpression;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class PoisonIvy {

	public PoisonIvy() {
		throw new TestingImpedimentException(
				"Do not instantiate concrete class, use interfaces");
	}

	public void poison() {

	}
}
