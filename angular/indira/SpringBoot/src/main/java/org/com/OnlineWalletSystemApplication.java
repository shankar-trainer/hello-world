package org.com;

import org.com.model.CardDetails;
import org.com.model.WalletAccount;
import org.com.model.WalletUser;
import org.com.service.CardDetailsService;
import org.com.service.WalletRepositoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SpringBootApplication
public class OnlineWalletSystemApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctx=	
				SpringApplication.run(OnlineWalletSystemApplication.class, args);
				
				
		
	/*	CardDetailsService cardservice = ctx.getBean(CardDetailsService.class);
		
		
		WalletRepositoryService service = ctx.getBean(WalletRepositoryService.class);

		  String UserName[]= {"R Kumar","S Kumar","P Kumar","L Kumar","H Kumar"};
		  String Password[]= {"r","s","p","l","h"};
		  long PhoneNumber[]= {132,456,789,987,357};
		  String LoginName[]= {"R K","S K","P K","L K","H K"};
		  long AadhaarNo[]= {7823,156465,456,4646,68793};
		  
		  double AccountBalance[]= {100,445,5546,79852,2223021};
		  String Status[]= {"Approve","Reject","Not Approve","Approve","Reject"};
		  
		WalletAccount account[]=new WalletAccount[5];

		WalletUser user []=new WalletUser[5];

		for(int i=0;i<user.length;i++)
		{
			
			user[i]=new WalletUser();
			user[i].setUserName(UserName[i]);
			user[i].setPassword(Password[i]);
			user[i].setPhoneNumber(PhoneNumber[i]);
			user[i].setLoginName(LoginName[i]);
			user[i].setAadhaarNo(AadhaarNo[i]);
			
			account[i] = new WalletAccount();
			
			account[i].setAccountBalance(AccountBalance[i]);
			account[i].setStatus(Status[i]);
			
			user[i].setWalletAccount(account[i]);
			
			account[i].setWalletUser(user[i]);
			
			service.addUser(user[i]);
			
		}

		service.showAllUser();
		
		
		
		int CardNo[]= {5596,7741,3301,8543,7984};
		int ExpiryMonth[]= {5,6,7,9,2};
		int ExpiryYear[]= {2025,2026,2027,2023,2029};
		double amountAvailable[]= {15000,798120,3341,646552,789311};
		  
		  CardDetails card[]=new CardDetails[5];
		  

		for(int i=0;i<card.length;i++)
		{
			
			card[i]=new CardDetails();
			card[i].setCardNo(CardNo[i]);
			card[i].setExpiryMonth(ExpiryMonth[i]);
			card[i].setExpiryYear(ExpiryYear[i]);
			card[i].setAmountAvailable(amountAvailable[i]);
			
			
			cardservice.addCard(card[i]);		
		}

		cardservice.showAllCard();*/

	}
	
	
	

}
