package com.packt.legacy.unfavorable.construct.staticblock;

import java.util.Date;

import com.packt.legacy.unfavorable.construct.TestingImpedimentException;

public class StaticBlockDependency {
    public static Date loadTime;
	public StaticBlockDependency() {
		throw new TestingImpedimentException("static blocks suck");
	}
}
