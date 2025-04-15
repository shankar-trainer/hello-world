package com.packt.legacy.unfavorable.construct.finals;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public final class FinalDepencyClass {

	public void poison() {
		throw new TestingImpedimentException("Finals cannot be mocked");
	}
}
