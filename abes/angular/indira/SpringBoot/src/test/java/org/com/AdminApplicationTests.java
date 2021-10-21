package org.com;


import org.com.model.WalletAccount;
import org.com.model.WalletAdmin;
import org.com.model.WalletUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class AdminApplicationTests {

	static Logger logger = LoggerFactory.getLogger(AdminApplicationTests.class);
	RestTemplate restTemplate;
	
	@BeforeEach
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	
	@Test
	public void addAdmin() {
		WalletAdmin admin1 = new WalletAdmin();
		
		admin1.setAdminName("Annie Douglas");
	    admin1.setPhoneNumber(9910303895L);
	    admin1.setPassword("annie");
	    admin1.setLoginName("annie98");
	    admin1.setAadhaarNo(986424756928L);
	   
		ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://localhost:9090/admin/addAdmin",admin1, String.class);
	     Assertions.assertNotNull(postForEntity);
	     
	     logger.info("add admin works");
	}
	
	@Test
	public void updateUser() {
        WalletAdmin admin1 = new WalletAdmin();
		admin1.setAdminId(1);
		admin1.setAdminName("Annie Douglas");
	    admin1.setPhoneNumber(9910303895L);
	    admin1.setPassword("annie2");
	    admin1.setLoginName("annie98");
	    admin1.setAadhaarNo(986424756928L);
	   
		ResponseEntity<String> putForEntity = restTemplate.postForEntity("http://localhost:9090/admin/updateAdmin",admin1, String.class);
	     Assertions.assertNotNull(putForEntity);
	     
	     logger.info("update user works");
	}
	
	@Test
	public void showAdminById() {
		WalletAdmin admin = restTemplate.getForObject("http://localhost:9090/admin/showAdmin/1", WalletAdmin.class);
	    Assertions.assertNotNull(admin);
	    logger.info("search admin works");
	}

	@Test
	public void removeAdminById() {
		WalletAdmin admin = restTemplate.getForObject("http://localhost:9090/admin/deleteAdmin/1", WalletAdmin.class);
	    Assertions.assertNotNull(admin);
	    logger.info("delete admin works");
	}

}
