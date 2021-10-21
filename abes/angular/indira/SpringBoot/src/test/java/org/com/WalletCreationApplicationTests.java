package org.com;


import org.com.model.WalletAccount;
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
class WalletCreationApplicationTests {

	static Logger logger = LoggerFactory.getLogger(WalletCreationApplicationTests.class);
	RestTemplate restTemplate;
	
	@BeforeEach
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void showUserById() {
		WalletUser user = restTemplate.getForObject("http://localhost:9090/wallet/showUser/3", WalletUser.class);
	    Assertions.assertNotNull(user);
	    logger.info("search user works");
	}
	
	/*@Test
	public void removeUserById() {
		WalletUser user = restTemplate.getForObject("http://localhost:9090/wallet/deleteUser/1", WalletUser.class);
	    Assertions.assertNotNull(user);
	    logger.info("delete user works");
	}*/
	
	@Test
	public void addUser() {
		WalletUser user1 = new WalletUser();
		
		user1.setUserName("Annie Douglas");
	    user1.setPhoneNumber(9910303895L);
	    user1.setPassword("annie");
	    user1.setLoginName("annie98");
	    user1.setAadhaarNo(986424756928L);
	   
		WalletAccount account1 = new WalletAccount();
		account1.setStatus("accepted");
		account1.setAccountBalance(789.0f);
	
		user1.setWalletAccount(account1);
		account1.setWalletUser(user1);
		
		ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://localhost:9090/wallet/addUser",user1, String.class);
	     Assertions.assertNotNull(postForEntity);
	     
	     logger.info("add user works");
	}
	
	/*@Test
	public void updateUser() {
		WalletUser user1 = new WalletUser();
		user1.setUserId(5);
		user1.setUserName("Annie Douglas");
	    user1.setPhoneNumber(9910303895L);
	    user1.setPassword("annie2");
	    user1.setLoginName("annie98");
	    user1.setAadhaarNo(986424756928L);
	   
		WalletAccount account1 = new WalletAccount();
		account1.setStatus("accepted");
		account1.setAccountBalance(789.0f);
	
		user1.setWalletAccount(account1);
		account1.setWalletUser(user1);
		
		ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://localhost:9090/wallet/updateUser",user1, String.class);
	     Assertions.assertNotNull(postForEntity);
	     
	     logger.info("update user works");
	}*/
	
	

}
