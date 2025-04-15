package com.packt.gradle;

public class EnvironmentService {
	public EnvironmentType getEnvironmentType() {
		return getEnvironmentType(new Environment().getName());
	}

	public EnvironmentType getEnvironmentType(String name) {
		if("dev".equals(name)) {
			return EnvironmentType.DEV;
		}else if("prod".equals(name)) {
			return EnvironmentType.PROD;
		}
		
		return null;
	}
}
