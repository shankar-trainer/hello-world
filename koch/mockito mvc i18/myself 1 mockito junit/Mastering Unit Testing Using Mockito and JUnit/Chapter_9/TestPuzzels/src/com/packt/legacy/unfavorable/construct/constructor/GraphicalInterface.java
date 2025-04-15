package com.packt.legacy.unfavorable.construct.constructor;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class GraphicalInterface {

	public static void showMessage(String msg) {
		throw new TestingImpedimentException("GUI objects need manual intervention");
	}
}
