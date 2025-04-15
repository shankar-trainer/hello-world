package com.packt.legacy.unfavorable.construct.finals;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class FinalDependency {

	public final void doSomething() {
		/*throw new TestingImpedimentException(
				"Final methods cannot be overriden");*/
	}
}
