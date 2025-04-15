package com.packtpub.junit.recap;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AssertTest.class, TestExecutionOrder.class,
		Assumption.class })
public class TestSuite {

}
