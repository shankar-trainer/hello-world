package org.com;


import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



@SpringBootTest
public class TransactionTest  {
	RestTemplate rst;

	@BeforeEach
	public void setup() { 
		rst = new RestTemplate();
	}
	
	
	@Test
	public void searchName() {
		WalletUser user = rst.getForObject("http://localhost:9090/transaction/SearchByName/{sam}", WalletUser.class);
		Assertions.assertNotNull(user);
	}

	@Test
	public void addTransaction() {
		WalletTransaction trans = new WalletTransaction();
		trans.setAmount(100);
		trans.setReceiverId(10);
		trans.setSenderId(12);
		trans.setDateOfTransaction(LocalDateTime.MAX.now());
		ResponseEntity<?> trans2 = rst.postForEntity("http://localhost:9090/transaction/addTransaction", trans, WalletTransaction.class);
		Assertions.assertNotNull(trans2);
		//Assertions.assetEquals(HttpStatus.OK, ResponseEntity.status(HttpStatus.OK));
	}

}
