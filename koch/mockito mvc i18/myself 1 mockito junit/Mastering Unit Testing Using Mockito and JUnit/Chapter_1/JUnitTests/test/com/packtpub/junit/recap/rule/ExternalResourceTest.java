package com.packtpub.junit.recap.rule;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

public class ExternalResourceTest {
	Resourece resourece;

	public @Rule ExternalResource rule = new ExternalResource() {
		@Override protected void before() throws Throwable {
			resourece = new Resourece();
			resourece.open();
			System.out.println(name.getMethodName());
		}
		
		@Override protected void after()  {
			resourece.close();
			System.out.println("\n");
		}
	};
	
	public @Rule TestName name = new TestName();
	@Test
	public void someTest() throws Exception {
		System.out.println(resourece.get());
		assertEquals(0, 0);
	}
	
	@Test
	public void someTest2() throws Exception {
		System.out.println(resourece.get());
	}
}

class Resourece{
	public void open() {
		System.out.println("Opened");
	}
	
	public void close() {
		System.out.println("Closed");
	}
	
	public double get() {
		return Math.random();
	}
}