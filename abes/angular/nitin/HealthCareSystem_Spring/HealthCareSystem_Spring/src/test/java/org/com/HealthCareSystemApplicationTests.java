package org.com;


import org.com.model.Admin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
class HealthCareSystemApplicationTests	 {
	
	static Logger logger = LoggerFactory.getLogger(HealthCareSystemApplicationTests.class);

	
	RestTemplate restTemplate;
	@BeforeEach
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void searchAdminRecord() {
		Admin admin = restTemplate.getForObject("http://localhost:9090/admin/searchAdmin/1003", Admin.class);
		Assertions.assertNotNull(admin);
		logger.info("Search Admin Works!!");
	}
	@Test
	public void addAdminRecord() {
		Admin admin = new Admin();
		admin.setId(1006);
		admin.setName("Abhijeet");
		admin.setPassword("1234");
		admin.setEmail("abhijeet@gmail.com");
		admin.setGender("Male");
		admin.setUserRole("admin");
		ResponseEntity<Admin> postForEntity = restTemplate.postForEntity("http://localhost:9090/admin/addAdmin/",admin, Admin.class);
		Assertions.assertNotNull(postForEntity);
		logger.info("Add Admin Works!!");
	}

}
