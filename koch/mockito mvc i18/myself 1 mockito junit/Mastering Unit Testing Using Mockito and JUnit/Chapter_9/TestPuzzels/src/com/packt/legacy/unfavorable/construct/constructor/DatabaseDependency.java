package com.packt.legacy.unfavorable.construct.constructor;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class DatabaseDependency {
	
	public DatabaseDependency() {
		throw new TestingImpedimentException("calls database");
	}
}
