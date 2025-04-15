package com.packt.legacy.unfavorable.construct.staticmethods;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class SingletonDependency {
	private static SingletonDependency singletonDependency;

	private SingletonDependency() {
	}

	public synchronized static SingletonDependency getInstance() {
		if (singletonDependency == null) {
			singletonDependency = new SingletonDependency();
		}

		return singletonDependency;
	}

	public static void callMe() {
		throw new TestingImpedimentException("Common we dont need singleton");
	}
	
	protected void wrapper() {
		callMe();
	}
}
