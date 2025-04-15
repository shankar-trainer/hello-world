package com.packt.gradle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class EnvironmentServiceTest {
	EnvironmentService service = new EnvironmentService();

	@Test
	public void returns_NULL_when_environment_not_configured() throws Exception {
		assertNull(service.getEnvironmentType("xysz"));
	}
	
	@Test
	public void production_environment_configured() throws Exception {
		EnvironmentType environmentType = service.getEnvironmentType("prod");
		assertThat(environmentType, is(EnvironmentType.PROD));
	}
}
