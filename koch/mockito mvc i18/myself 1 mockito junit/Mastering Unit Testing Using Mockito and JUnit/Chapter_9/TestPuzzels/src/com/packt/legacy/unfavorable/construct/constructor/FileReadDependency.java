package com.packt.legacy.unfavorable.construct.constructor;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class FileReadDependency {
	public FileReadDependency() {
		throw new TestingImpedimentException("File read error");
	}
}
