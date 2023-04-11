package org.audintel.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfoguration {

	@Bean
	@Scope(value = "prototype")
	public User getUserBean() {
		User user = new User();
		user.setUserId(787878);
		user.setUserName("arvind kumar");
		user.setUserSalary(12000);
		return user;
	}

	@Bean
	@Scope(value = "prototype")
	public Address getAddressBean() {
		Address address = new Address();
		address.setAddrId(8787878);
		address.setAddrStreet("street3");
		address.setAddrCity("hyderabad");
		address.setAddrState("telengana");
		address.setAddrPin(77878778);
		return address;
	}
}
