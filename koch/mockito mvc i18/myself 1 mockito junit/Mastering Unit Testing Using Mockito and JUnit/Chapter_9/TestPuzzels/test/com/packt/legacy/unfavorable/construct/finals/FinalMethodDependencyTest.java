package com.packt.legacy.unfavorable.construct.finals;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FinalMethodDependencyTest {
	@Mock
	FinalDependency finalDependency;
	FinalMethodDependency methodDependency;

	@Before
	public void setUp() {
		methodDependency = new FinalMethodDependency(finalDependency);
	}

	@Test
	public void testSomething() throws Exception {
		doNothing().when(finalDependency).doSomething();
		methodDependency.testMe();
	}
}
